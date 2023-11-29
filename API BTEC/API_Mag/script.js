async function getTracksByArtist() {
  const url =
    "https://spotify23.p.rapidapi.com/search/?q=Dirk%20massen&type=tracks&offset=0&limit=10&numberOfTopResults=5";
  const options = {
    method: "GET",
    headers: {
      "X-RapidAPI-Key": "94966e9234mshd5e4add561deb57p1bcfb8jsnaa4bf4e91290",
      "X-RapidAPI-Host": "spotify23.p.rapidapi.com",
    },
  };

  try {
    const response = await fetch(url, options);
    const result = await response.json();
    let tracksArray = result.tracks.items;
    let trackID;
    for (let i = 0; i < tracksArray.length; i++) {
      trackID = result.tracks.items[i].data.id;
      getTrackByID(trackID);
    }
    // getTrackByID(trackID);
  } catch (error) {
    console.error(error);
  }
}
async function getTrackByID(trackID) {
  const url = "https://spotify23.p.rapidapi.com/tracks/?ids=" + trackID;
  const options = {
    method: "GET",
    headers: {
      "X-RapidAPI-Key": "94966e9234mshd5e4add561deb57p1bcfb8jsnaa4bf4e91290",
      "X-RapidAPI-Host": "spotify23.p.rapidapi.com",
    },
  };

  try {
    const response = await fetch(url, options);
    const result = await response.json();
    var song = document.createElement("AUDIO");
    song.setAttribute("src", result.tracks[0].preview_url);
    song.setAttribute("controls", "controls");
    song.setAttribute("title", result.tracks[0].name);
    document.body.appendChild(song);
  } catch (error) {
    console.error(error);
  }
}

let container = document.getElementById("container");
async function getMovies() {
  const url = "https://imdb-top-100-movies.p.rapidapi.com/";

  const options = {
    method: "GET",

    headers: {
      "X-RapidAPI-Key": "580b702b78mshe63b88cd6a8cae0p17eeecjsn44cb46e95948",
      "X-RapidAPI-Host": "imdb-top-100-movies.p.rapidapi.com",
    },
  };

  try {
    const response = await fetch(url, options);

    const result = await response.json();

    for (let i = 0; i < result.length; i++) {
      let card = document.createElement("div");

      card.id = "card";

      container.appendChild(card);

      let image = document.createElement("img");

      image.src = result[i].image;

      card.appendChild(image);

      image.width = 200;

      image.height = 200;

      let title = document.createElement("h3");

      title.innerHTML = result[i].title;

      card.appendChild(title);

      let rating = document.createElement("p");

      rating.innerHTML = "Rating: " + result[i].rating;

      card.appendChild(rating);

      rating.style.color = "blue";

      let showDetails = document.createElement("button");

      showDetails.innerHTML = "Show Details";

      card.appendChild(showDetails);

      showDetails.id = "showdetails";
    }
  } catch (error) {
    console.error(error);
  }
}

getMovies();
getTracksByArtist();
