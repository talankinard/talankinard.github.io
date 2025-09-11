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




