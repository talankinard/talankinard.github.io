document.getElementById("sun-head").onclick = () =>
{
    document.getElementById("sun-txt").classList.remove("hidden");
};

document.getElementById("sun-img").onclick = (event) =>
{
    document.getElementById("sun-img").classList.add("hidden"); 
    document.getElementById("moon-img").classList.remove("hidden");
};

document.getElementById("moon-img").onclick = (event) =>
{
    document.getElementById("sun-img").classList.remove("hidden"); 
    document.getElementById("moon-img").classList.add("hidden");
};

document.getElementById("colorPicker").oninput = (event) =>
{
    const chosenColor = event.currentTarget.value;
    const p = document.getElementById("p-color");
    p.style.color = chosenColor;
    const code = document.getElementById("color-code");
    code.innerHTML = chosenColor;
};


//just fun practice
document.getElementById("footer").onmouseover = (event) =>
{
    document.getElementById("name").classList.add("hidden"); 
    document.getElementById("home").classList.remove("hidden");
};

document.getElementById("footer").onmouseout = () => 
{
    document.getElementById("name").classList.remove("hidden");
    document.getElementById("home").classList.add("hidden");
};





