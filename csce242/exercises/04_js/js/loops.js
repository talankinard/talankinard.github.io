document.getElementById("btn-display").onclick = () =>
{
    const displaySection = document.getElementById("loop-result");
    const ul=document.createElement("ul");
    displaySection.append(ul);
    
    for(let i=0; i<10; i++)
    {
        const li=document.createElement("li");
        ul.append(li);
        li.innerHTML = `${i} banana(s)`;
    }

};

document.getElementById("btn-count").onclick = () =>
{
    const error=document.getElementById("error-number");
    error.innerHTML = "";

    const startNum = parseInt(document.getElementById("txt-start").value); //convert values into Integer
    const endNum = document.getElementById("txt-end").value;

    const resultDiv = document.getElementById("d-count");
    resultDiv.innerHTML = "";

    if(startNum > endNum)
    {
        error.innerHTML = "* Second num must be more than the first.";
        return;
    }
};