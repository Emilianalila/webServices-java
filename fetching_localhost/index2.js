function getList() {
  fetch("http://localhost:8080/listPeople")
    .then((response) => response.json())
    .then((data) => {
      console.log(data); // array
      const container = document.querySelector(".js-container");
      container.innerHTML = "";

      data.forEach((element) => {   // iterating in the array of objects
        const divList = document.createElement("div");
        divList.className = "js-div";
        container.appendChild(divList);

        const name = document.createElement("h4");
        name.innerHTML = element.name;
        divList.appendChild(name);
      });
    }) 
    .catch((err) => console.log(err));
}
