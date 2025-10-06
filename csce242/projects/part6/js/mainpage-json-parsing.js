const getPopularItems = async() =>
{
    const url = "";

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