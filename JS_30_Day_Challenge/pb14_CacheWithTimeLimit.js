var TimeLimitedCache = function () {
    this.cache = new Map();
};

/**
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */

TimeLimitedCache.prototype.set = function (key, value, duration) {
    const entry = this.cache.get(key);
    const found = entry !== undefined;

    if (found) clearTimeout(entry.ref);
    const ref = setTimeout(() => this.cache.delete(key), duration);
    this.cache.set(key, { value, ref });

    return found;
};

/**
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function (key) {
    const val = this.cache.get(key);
    return val ? val.value : -1;
};

/**
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function () {
    return this.cache.size;
};
var TimeLimitedCache = function () {
    this.cache = new Map();
};

/**
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */

TimeLimitedCache.prototype.set = function (key, value, duration) {
    const entry = this.cache.get(key);
    const found = entry !== undefined;

    if (found) clearTimeout(entry.ref);
    const ref = setTimeout(() => this.cache.delete(key), duration);
    this.cache.set(key, { value, ref });

    return found;
};

/**
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function (key) {
    const val = this.cache.get(key);
    return val ? val.value : -1;
};

/**
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function () {
    return this.cache.size;
};
var TimeLimitedCache = function () {
    this.cache = new Map();
};

/**
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */

TimeLimitedCache.prototype.set = function (key, value, duration) {
    const entry = this.cache.get(key);
    const found = entry !== undefined;

    if (found) clearTimeout(entry.ref);
    const ref = setTimeout(() => this.cache.delete(key), duration);
    this.cache.set(key, { value, ref });

    return found;
};

/**
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function (key) {
    const val = this.cache.get(key);
    return val ? val.value : -1;
};

/**
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function () {
    return this.cache.size;
};
