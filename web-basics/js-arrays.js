
let items = [];

items.push(100)
items.push('Suraj')
items.push(10)
items.push(6.5)

// for(let i=0;i<items.length; i++){
//     console.log(items[i])
// }

// for(let item of items){
//     console.log(item)
// }

items.forEach(item=>console.log(item))

// items.pop();
// console.log("After popping : ")
// items.forEach(item=>console.log(item))

items.splice(2,1);
console.log("After deleting : ")
items.forEach(item=>console.log(item))


