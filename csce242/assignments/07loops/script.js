
const current = new Date().getHours()
const sun = document.getElementById("sun");
const moon = document.getElementById("moon");
    
if(current >= 18 || current < 6)
{
    document.body.style.backgroundColor = "black";
    sun.classList.add("hidden");
    moon.classList.remove("hidden");
}
else
{
    sun.classList.remove("hidden");
    moon.classList.add("hidden");
}

document.getElementById("btn-scene").onclick = () =>
{
    const cloudContain = document.getElementById("clouds");
    const treeContain  = document.getElementById("trees");

    for(let i=0; i<6; i++)
    {
        const cloud = document.createElement("div");
        cloud.className="cloud";
        cloud.style.top = "300px";
        cloud.style.left = `${295 + i * 150}px`; /* cite https://stackoverflow.com/questions/24659648/absolute-positioning-for-dynamically-created-elements*/
        cloudContain.appendChild(cloud);
    }

    for (let i = 0; i < 6; i++) 
    {
        const tree = document.createElement("div");
        tree.className = "tree";
        tree.style.top = "500px";
        tree.style.left   = `${310 + i * 150}px`;
        treeContain.appendChild(tree);
    }
};