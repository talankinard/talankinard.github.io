const getPopItems = async() =>
{
    const base = "https://talankinard.github.io/csce242/projects/part6/json/mainpage.json";
    const url = `${base}?v=${Date.now()}`; //chatgpt told me to add to update my json live

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

const showGames = async () => 
{
    const popItems = await getPopItems();
    const grid = document.querySelector(".popular-grid");

  

    popItems.forEach((game) => 
    {
        const card = document.createElement("section");
        card.className = "pop";

        const h3 = document.createElement("h3");
        h3.textContent = game.name;
        card.appendChild(h3);

        const imgBox = document.createElement("div");
        imgBox.className = "img-box";

        const img = document.createElement("img");
        img.src = `json/images/${game.img}`;
        img.alt = game.name;

        imgBox.appendChild(img);
        card.appendChild(img);
        
        //if this button is clicked displays the other details of the item
        const btn = document.createElement("button");
        btn.textContent = "More Details";
        btn.className = "btn-details";
        card.appendChild(btn);

        //created in a hidden div
        const details = document.createElement("div");
        details.className = "card-details hidden";

        const desc = document.createElement("p");
        desc.textContent = game.description;
        details.appendChild(desc);

        const price = document.createElement("p");
        price.textContent = "Price: " + game.price;
        details.appendChild(price);

        const rating = document.createElement("p");
        rating.textContent = "Rating: " + game.rating;
        details.appendChild(rating);

        //review list if existw
        if (game.reviews) {
        const reviewsTitle = document.createElement("p");
        reviewsTitle.innerHTML = "<strong>Reviews:</strong>";
        details.appendChild(reviewsTitle);

        const ul = document.createElement("ul");
        for (let i = 0; i < game.reviews.length; i++) 
        {
            const li = document.createElement("li");
            li.textContent = game.reviews[i];
            ul.appendChild(li);
        }
        details.appendChild(ul);
    }

    card.appendChild(details);

    btn.addEventListener("click", () => 
    {
      if (details.classList.contains("hidden")) 
        {
        details.classList.remove("hidden");
        btn.textContent = "Hide Details";
        } 
        else 
        {
        details.classList.add("hidden");
        btn.textContent = "More Details";
      }
    });

    grid.appendChild(card);
  });
};

showGames();