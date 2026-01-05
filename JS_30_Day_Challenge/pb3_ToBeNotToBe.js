var expect = function (val) {
    return {
        toBe: function (oppValue) {
            if (val === oppValue) return true;
            throw new Error('Not Equal');
        },
        notToBe: function (oppValue) {
            if (val !== oppValue) return true;
            throw new Error('Equal');
        },
    };
};
