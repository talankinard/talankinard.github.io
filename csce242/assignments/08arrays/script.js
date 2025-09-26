const houses = 
[
  ["The Suburban Bungalow", "images/fixer1.webp"],
  ["The Shingle Shack", "images/fixers3.webp"],
  ["The Unstately Manor", "images/fixer5.webp"],
  ["The '80s Rancher", "images/fixer7.webp"]
];

const afterImages = 
[
  "images/fixer2.webp",
  "images/fixer4.webp",
  "images/fixer6.webp",
  "images/fixer8.webp"
];

const gallery = document.getElementById("images");
gallery.innerHTML = "";


for (let i = 0; i < houses.length; i++) {
  let name = houses[i][0];
  let beforeImg = houses[i][1];

  const wrapper = document.createElement("div");
  wrapper.className = "house";

  const img = document.createElement("img");
  img.src = beforeImg;
  img.alt = name;

  const caption = document.createElement("div");
  caption.className = "caption";
  caption.innerHTML = name;

  wrapper.appendChild(img);
  wrapper.appendChild(caption);
  gallery.appendChild(wrapper);
  
  img.onclick = () => 
  {
    document.getElementById("popup-title").innerText = name;
    document.getElementById("popup-img").src = afterImages[i];
    document.getElementById("popup-img").alt = name + " (After)";
    document.getElementById("popup").classList.remove("hidden");
  };
}

document.getElementById("close").onclick = () => 
{
    document.getElementById("popup").classList.add("hidden");
};


