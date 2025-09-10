/*

const sayHello = () => 
{
    console.log("hello world");

}

document.getElementById("btn-click-me").onclick = sayHello;

*/

/* ideal method */
document.getElementById("btn-click-me").onclick = () =>
{
    console.log("hello world");

};