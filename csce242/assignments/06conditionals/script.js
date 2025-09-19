document.getElementById("ex-1").onclick = () =>
{
    document.getElementById("plant").classList.remove("hidden");
    document.getElementById("clock").classList.add("hidden");
}

document.getElementById("ex-2").onclick = () =>
{
    document.getElementById("clock").classList.remove("hidden");
    document.getElementById("plant").classList.add("hidden");
}

/* Slider */

const slider = document.getElementById("sliderInp");
const textOutput = document.getElementById("sliderText");
const textOutputTwo = document.getElementById("sliderTextTwo");
const imageOutput = document.getElementById("sliderImage");

slider.addEventListener("input", () => //event listener cred https://stackoverflow.com/questions/19625334/how-to-create-an-event-handler-for-a-range-slider
{
    textOutput.innerHTML = `It's been ${slider.value} days since watering your plant.`;

    if(slider.value < 3)
    {
        document.getElementById("sliderImage").classList.remove("hidden");
        imageOutput.src = "images/plant1.png";
        textOutputTwo.innerHTML = "Your plant is healthy and happy woo!";
    }
    else if(slider.value >= 3 & slider.value < 6)
    {
        document.getElementById("sliderImage").classList.remove("hidden");
        imageOutput.src = "images/plant2.png";
        textOutputTwo.innerHTML = "Your plant needs watering.";
    }
    else if(slider.value >= 6 & slider.value < 10)
    {
        document.getElementById("sliderImage").classList.remove("hidden");
        imageOutput.src = "images/plant3.png";
        textOutputTwo.innerHTML = "Your plant is dying.";
    }
    else if(slider.value >= 10 & slider.value < 13)
    {
        document.getElementById("sliderImage").classList.remove("hidden");
        imageOutput.src = "images/plant4.png";
        textOutputTwo.innerHTML = "Your plant is dead, RIP.";
    }

});

setInterval( () =>
{
    const current = new Date();
    let hours = current.getHours();
    let minutes = current.getMinutes();
    let ampm = "am";


    if (hours >= 12) 
    {
        ampm = "pm";
        if (hours > 12) hours = hours - 12; //not 24hr time
    }
  if (hours === 0) 
    {
        hours = 12;
    }

  if (minutes < 10) 
    {
        minutes = "0" + minutes;
    }

    document.getElementById("clockTime").innerHTML =  hours + ":" + minutes+" "+ampm;
});