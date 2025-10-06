const getShoes = async() =>
{
    const url = "https://portiaportia.github.io/json/shoes.json";

    try
    {
        const response = await fetch(url); //fetches data from url, await doesnt do the next line of code until this line completed
        return response.json();
    }
    catch(error)
    {
        console.log("sorry");
    }

};

const showShoes = async() =>
{
    const shoes = await getShoes();
    const shoeListDiv = document.getElementById("shoe-list");
    const section = document.createElement("section");
        
    shoes.forEach((shoe) =>
    {
        //make section for each shoe then append to shoe list
        const section = document.createElement("section");
        section.classList.add("shoe");
        
        const h3 = document.createElement("h3");
        section.append(h3);
        h3.innerHTML = shoe.name;

        const brand = document.createElement("p");
        section.append(brand);
        brand.innerHTML = `Brand: ${shoe.brand}`;
        
        const price = document.createElement("p");
        section.append(price);
        price.innerHTML = `Price: ${shoe.price}`;

        const ul = document.createElement("ul");
        section.append(ul);

        shoe.reviews.forEach((review) =>
        {
            const li = document.createElement("li");
            li.innerHTML = review;
            ul.append(li);
        });

        //image 
        const img =document.createElement("img");
        section.append(img);
        img.src = `https://portiaportia.github.io/json/shoes.json/${shoe.img}`;

        shoeListDiv.append(section);

        return section;
    });
};

showShoes();