/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function (arr1, arr2) {
    const mp = new Map();

    for (a of arr1) mp[a.id] = a;

    for (b of arr2) {
        if (mp[b.id]) {
            for (const c in b) mp[b.id][c] = b[c];
        } else {
            mp[b.id] = b;
        }
    }

    return Object.values(mp);
};
