function elemAdd(arr, target) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = 1; j < arr.length; j++) {
            if (arr[i] + arr[j] === target) {
                return [i, j]
            }
        }
    }
}

