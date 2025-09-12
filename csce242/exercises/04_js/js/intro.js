/*

const sayHello = () => 
{
    console.log("hello world");

}

document.getElementById("btn-click-me").onclick = sayHello;

*/

/* ideal method */
document.getElementById("btn-click-me").onclick = (event) =>
{    
    document.getElementById("p-welcome").innerHTML = "Hello World";
    event.currentTarget.classList.add("clicked"); //applies clicked class to the btn when clicked using event
    
};

document.getElementById("happy-button").onclick = () =>
{
    const pFeeling = document.getElementById("p-feeling");
    pFeeling.innerHTML = "YAY";
    pFeeling.classList.add("happy");
    pFeeling.classList.remove("sad");
};

document.getElementById("sad-button").onclick = () =>
{
    const pFeeling = document.getElementById("p-feeling");
    pFeeling.innerHTML = "Nay";
    pFeeling.classList.add("sad");
    pFeeling.classList.remove("happy");
};

document.getElementById("clear-button").onclick = () =>
{
    const pFeeling = document.getElementById("p-feeling");
    pFeeling.innerHTML = "";
    pFeeling.classList.add("sad");
    pFeeling.classList.remove("happy");
};

document.getElementById("txt.emotion").onkeyup = (event) =>
{
    const userInput = event.currentTarget.value;
    document.getElementById("p-emotion").innerHTML = `You are feeling ${userInput}.`;
    document.getElementById("img-emotion").classList.remove("hidden");
    
    //.style.color maybe
};

