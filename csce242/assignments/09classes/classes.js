//window popup stuff
const popup      = document.getElementById("popup");
const popupTitle = document.getElementById("popup-title");
const popupImg   = document.getElementById("popup-img");
const popupClose = document.getElementById("close");
const popupArtist = document.getElementById("popup-artist");


class Painting
{
    constructor(name, artist, image)
    {
        this.name = name;
        this.artist = artist;
        this.image = image;
    }

    get item()
    {
        const section = document.createElement("section");
        section.classList.add("painting");

        const h3 = document.createElement("h3");
        h3.innerHTML = this.name;
        section.append(h3); 

        const divCol1 = document.createElement("div");
        section.append(divCol1);

        const img = this.picture(this.image);
        img.alt = this.name;

        img.addEventListener("click", () => 
        {
            popupTitle.textContent = this.name;
            popupArtist.textContent = "by " + this.artist;
            popupImg.src = "images/" + this.image;
            popupImg.alt = this.name;
            popup.classList.toggle("visible");
        });

 
        divCol1.append(img);

        return section;
    }

    picture(filename) 
    {
        const img = document.createElement("img");
        img.src = `images/${filename}`;
        return img;
    }
    
    
}

const paintings = [];
paintings.push(new Painting("Lighthouse Painting","regencygirl123","lighthouse.png"));
paintings.push(new Painting("Mushroom Painting","Liskalissa","mushroom.jpg"));
paintings.push(new Painting("Rose Painting","Ray_Shrewsberry","rose.png"));
paintings.push(new Painting("Japanese House Painting","kapit0n","japanhouse.jpg"));
paintings.push(new Painting("Horizon Painting","jensenartofficial","horizon.jpg"));


const paintingListDiv = document.getElementById("painting-list");

paintings.forEach((painting) =>
{
    paintingListDiv.append(painting.item);
});

popupClose.addEventListener("click", () => popup.classList.remove("visible"));

