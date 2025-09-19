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

document.getElementById("btn-mood-ring").onclick = () => 
{
    const color = document.getElementById("txt-color").value.trim().toLowerCase();
    const p = document.getElementById("p-mood-result");
    const error = document.getElementById("error-color");
    p.innerHTML=""; //reset paragraph
    error.innerHTML = "";
    let mood = "";

    if(color == "")
    {
        error.innerHTML = "* Invalid color"; //error msg
        return;
    }

    if(color == "red")
    {
        mood = "angry";
    } else if(color == "blue")
    {
        mood="sad";
 
    } else if(color == "yellow")
    {
        mood="mellow";
    }

    if(mood == "")
    {
        error.innerHTML="* Invalid color dork";
        return;
    }

    p.innerHTML = `You chose ${color}, so you are feeling ${mood} (probably).`;
}

document.getElementById("btn-bounce").onclick = (event) => 
{
    const ball = document.getElementById("ball");


    if(ball.classList.contains == "bounce")
    {
        event.currentTarget.innerHTML = "Start";
    }else
    {
        event.currentTarget.innerHTML = "Stop";
    }

    ball.classList.toggle("bounce");
}

/* Counter */

let counter = 0;
let counterInterval;
const countP = document.getElementById("p-count");
const btnStartCount = document.getElementById("btn-count-pause");
const btnPauseCount = document.getElementById("btn-count-pause");
btnPauseCount.disabled = true;

btnStartCount.onclick = () =>
{
    btnStartCount.disabled = true;
    btnPauseCount.disabled = false;
    counterInterval = setInterval(()=>{
        counter++;
        countP.innerHTML = counter;
    },1000);
}

btnPauseCount.onclick = () =>
{
    clearInterval(counterInterval);
    btnPauseCount.disabled = true;
    btnStartCount.disabled = false;
}

/* Donations */

const goal = 10000;
document.getElementById("goal-span").innerHTML = goal;

document.getElementById("btn-donations").onclick = () => {
    const donation = document.getElementById("txt-donations").value;
    const errorSpan = document.getElementById("donation-error");
    errorSpan.innerHTML = "";
    const donationMessage = document.getElementById("donationMessage");
    donationMessage.innerHTML = "";

    if(isNaN(donation) || donation <= 0){
        errorSpan.innerHTML = "* Invalid Amount."
        return;
    }

    const donationPercent = donation / goal * 100;

    if(donationPercent >= 100)
    {
        donationMessage.innerHTML = "Goal Reached!";
    }else if(donationPercent >= 50)
    {
        donationMessage.innerHTML = "Halfway There!";
    }
    else
    {
        donationMessage.innerHTML = "Yikes.";
    }

    //updates css variable
    document.querySelector(":root").style.setProperty("--donation-percent", donationPercent + "%");
}