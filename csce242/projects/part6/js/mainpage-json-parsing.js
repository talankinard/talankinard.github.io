const getPopItems = async() =>
{
    const url = "https://talankinard.github.io/csce242/projects/part6/json/mainpage.json";

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

const showGames = async() =>
{
    const popItems = await getPopItems();
    const popItemsDiv = document.querySelector(".popular-grid");


    popItems.forEach((game) => 
    {
        const section = document.createElement("section");
        section.classList.add("pop");

        const h3 = document.createElement("h3");
        h3.innerHTML = game.name;
        section.append(h3);

        const img = document.createElement("img");
        img.src = `json/images/${game.img}`;
        img.alt = game.name;
        section.append(img);

        const desc = document.createElement("p");
        desc.innerHTML = game.description;
        section.append(desc);

        const price = document.createElement("p");
        price.innerHTML = `Price: ${game.price}`;
        section.append(price);

        const rating = document.createElement("p");
        rating.innerHTML = `Rating: ${game.rating}`;
        section.append(rating);

        const ul = document.createElement("ul");
        game.reviews.forEach((review) => 
        {
            const li = document.createElement("li");
            li.innerHTML = review;
            ul.append(li);
        });
        section.append(ul);

        popItemsDiv.append(section);


    });
}

showGames();