class EventEmitter {
    constructor() {
        /* ================================
           OPTION 1: Using Normal Object
           ================================ */

        this.events = {};

        /* ================================
           OPTION 2: Using Map (Preferred)
           ================================ */

        // this.events = new Map();
    }

    subscribe(eventName, callback) {
        /* ===== OBJECT VERSION ===== */
        if (!this.events[eventName]) {
            this.events[eventName] = new Set();
        }
        this.events[eventName].add(callback);

        /* ===== MAP VERSION ===== */
        // if (!this.events.has(eventName)) {
        //     this.events.set(eventName, new Set());
        // }
        // this.events.get(eventName).add(callback);

        return {
            unsubscribe: () => {
                /* ===== OBJECT VERSION ===== */
                this.events[eventName]?.delete(callback);
                if (this.events[eventName]?.size === 0) {
                    delete this.events[eventName];
                }

                /* ===== MAP VERSION ===== */
                // this.events.get(eventName)?.delete(callback);
                // if (this.events.get(eventName)?.size === 0) {
                //     this.events.delete(eventName);
                // }
            },
        };
    }

    emit(eventName, args = []) {
        /* ===== OBJECT VERSION ===== */
        if (!this.events[eventName]) return [];
        // return [...this.events[eventName]].map((cb) => cb(...args)); //OR
        return Array.from(this.events[eventName], (cb) => cb(...args)); //This line converts a Set of callbacks into an array while executing each callback with the provided arguments, and returns the collected results.

        /* ===== MAP VERSION ===== */
        // if (!this.events.has(eventName)) return [];
        // return [...this.events.get(eventName)].map(cb => cb(...args));
    }
}
