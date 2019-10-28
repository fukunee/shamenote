/**
 * @param {string} name
 * @param {string} typed
 * @return {boolean}
 */
var isLongPressedName = function(name, typed) {
    let curr1=0,curr2=0;
    while(curr1<name.length||curr2<typed.length){
        if(name[curr1]!==typed[curr2])return false;
        if(typed[curr2]!==typed[curr2+1]||name[curr1]===name[curr1+1])curr1++;
        curr2++;
    }
    return true;
};