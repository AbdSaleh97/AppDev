let button = document.getElementById("submit");

button.addEventListener("click", call);

async function call() {
  let parameter = document.getElementById("parameter").value;
  const url = `https://weatherapi-com.p.rapidapi.com/current.json?q=${parameter}`;

  const messageElement = document.getElementById("message");

  if (parameter.trim() === "") {
    messageElement.textContent = "Please fill in the field.";
    messageElement.style.display = "block";
  } else {
    messageElement.textContent = "";
    messageElement.style.display = "none";

    const opts = {
      method: "GET",
      headers: {
        "X-RapidAPI-Key": "580b702b78mshe63b88cd6a8cae0p17eeecjsn44cb46e95948",
        "X-RapidAPI-Host":
          "driving-distance-calculator-between-two-points.p.rapidapi.com",
      },
    };

    const options = {
      method: "GET",
      headers: {
        "X-RapidAPI-Key": "580b702b78mshe63b88cd6a8cae0p17eeecjsn44cb46e95948",
        "X-RapidAPI-Host": "weatherapi-com.p.rapidapi.com",
      },
    };

    const option = {
      method: "GET",
      headers: {
        "X-RapidAPI-Key": "580b702b78mshe63b88cd6a8cae0p17eeecjsn44cb46e95948",
        "X-RapidAPI-Host": "cost-of-living-and-prices.p.rapidapi.com",
      },
    };

    try {
      const response = await fetch(url, options);
      const result = await response.json();

      const errorMsg = document.getElementById("errorMessage");

      if (result.error && result.error.code === 1006) {
        errorMsg.textContent = "Location is not available.";
        errorMsg.style.display = "block";
      } else {
        errorMsg.textContent = "";
        errorMsg.style.display = "none";
        const opt = {
          method: "POST",
          headers: {
            "content-type": "application/x-www-form-urlencoded",
            "X-RapidAPI-Key":
              "580b702b78mshe63b88cd6a8cae0p17eeecjsn44cb46e95948",
            "X-RapidAPI-Host": "worldwide-restaurants.p.rapidapi.com",
          },
          body: new URLSearchParams({
            q: result.location.name,
            language: "en_US",
          }),
        };

        let newContainer = document.createElement("div");
        newContainer.id = "container";
        document.body.appendChild(newContainer);

        let temp_c = document.createElement("p");
        temp_c.innerHTML = "Current Temperature: " + result.current.temp_c;
        newContainer.appendChild(temp_c);

        let cityName = document.createElement("p");
        cityName.innerHTML = "city: " + result.location.name;
        newContainer.appendChild(cityName);

        let lat = document.createElement("p");
        lat.innerHTML = "Latitude cordination:" + result.location.lat;
        newContainer.appendChild(lat);

        let long = document.createElement("p");
        long.innerHTML = "Logitude cordination: " + result.location.lon;
        newContainer.appendChild(long);

        let localTime = document.createElement("p");
        localTime.innerHTML = "Time: " + result.location.localtime;
        newContainer.appendChild(localTime);

        let condition = document.createElement("p");
        condition.innerHTML = "Condition: " + result.current.condition.text;
        newContainer.appendChild(condition);

        let conditionIMG = document.createElement("img");
        conditionIMG.src = result.current.condition.icon;
        newContainer.appendChild(conditionIMG);

        let wndSpeed = document.createElement("p");
        wndSpeed.innerHTML = "Wind Speed:" + result.current.wind_kph + " KPH";
        newContainer.appendChild(wndSpeed);

        const Pricesurl = `https://cost-of-living-and-prices.p.rapidapi.com/prices?city_name=${result.location.name}&country_name=${result.location.country}`;

        const respons = await fetch(Pricesurl, option);
        const res = await respons.json();

        let jeansPrice = document.createElement("p");
        jeansPrice.innerHTML =
          res.prices[4].item_name +
          " price on average is: " +
          res.prices[4].avg +
          res.prices[4].currency_code;
        newContainer.appendChild(jeansPrice);

        let applePrice = document.createElement("P");
        applePrice.innerHTML =
          res.prices[7].item_name +
          " price on average is: " +
          res.prices[7].avg +
          res.prices[7].currency_code;
        newContainer.appendChild(applePrice);

        let cigaretePrice = document.createElement("p");
        cigaretePrice.innerHTML =
          res.prices[20].item_name +
          " price on average is: " +
          res.prices[20].avg +
          res.prices[20].currency_code;

        let rentPrice = document.createElement("p");
        rentPrice.innerHTML =
          res.prices[27].item_name +
          " " +
          res.prices[27].category_name +
          " on average is: " +
          res.prices[27].avg +
          res.prices[27].currency_code;
        newContainer.appendChild(rentPrice);

        let salary = document.createElement("P");
        salary.innerHTML =
          res.prices[36].item_name +
          " is: " +
          res.prices[36].usd.avg +
          res.prices[36].currency_code;
        newContainer.appendChild(salary);

        let gasPrice = document.createElement("p");
        gasPrice.innerHTML =
          res.prices[40].item_name +
          " price is: " +
          res.prices[40].max +
          res.prices[40].currency_code;
        newContainer.appendChild(gasPrice);

        const IDurl = "https://worldwide-restaurants.p.rapidapi.com/typeahead";
        const rsp = await fetch(IDurl, opt);
        const r = await rsp.json();

        let temp = r.results.data[0].result_object.location_id;

        const t = "https://worldwide-restaurants.p.rapidapi.com/search";
        const op = {
          method: "POST",
          headers: {
            "content-type": "application/x-www-form-urlencoded",
            "X-RapidAPI-Key":
              "580b702b78mshe63b88cd6a8cae0p17eeecjsn44cb46e95948",
            "X-RapidAPI-Host": "worldwide-restaurants.p.rapidapi.com",
          },
          body: new URLSearchParams({
            language: "en_US",
            location_id: temp,
            currency: "USD",
            offset: "0",
          }),
        };
        const resResponse = await fetch(t, op);
        const resturantRes = await resResponse.json();

        let restaurant = document.createElement("p");
        restaurant.innerHTML =
          "Nearest resturants in this ares is " +
          resturantRes.results.data[0].name;
        newContainer.appendChild(restaurant);

        let resWEB = document.createElement("p");
        resWEB.innerHTML =
          "Resturants Website, phone number and address: " +
          resturantRes.results.data[0].website +
          "\n " +
          resturantRes.results.data[0].phone +
          "\n" +
          resturantRes.results.data[0].address;
        newContainer.appendChild(resWEB);

        const DestinatioUurl = `https://driving-distance-calculator-between-two-points.p.rapidapi.com/data?origin=${result.location.lat}${result.location.lon}&destination=${resturantRes.results.data[0].latitude}${resturantRes.results.data[0].longitude}`;

        const rspon = await fetch(DestinatioUurl, opts);
        const data = await rspon.json();

        let distance = document.createElement("p");
        distance.innerHTML = `The distance between your current location and the restaurant is: ${data.distance_in_kilometers} KM\nYour estimated time of arrival is: ${data.travel_time} minute`;
        newContainer.appendChild(distance);

        console.log(result);
      }
    } catch (error) {
      console.error(error);
    }
  }
}
