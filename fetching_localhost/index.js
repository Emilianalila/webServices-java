async function getList() {
  try {
    //try to run this code
    const data = await fetch("http://localhost:8080/listPeople");// without "s", just http
    if (!data.ok) {
      throw new Error("source not found");
    }else {
      const response = await data.json();
      console.log(response);

      const container = document.querySelector(".js-container")
      container.innerHTML = "";

      response.forEach(element => {
         console.log(element);

         const divEachPerson = document.createElement("div")
         divEachPerson.className = "js-div";
         container.appendChild(divEachPerson);

         const title = document.createElement("h3")
         title.innerHTML= element.name;
         divEachPerson.appendChild(title);

         const lastName = document.createElement("h3")
         lastName.innerHTML = element.lastName;
         divEachPerson.appendChild(lastName);

        if (element.onePet === null){
          const noPet = document.createElement("p")
          noPet.innerHTML = "not Pet";
          divEachPerson.appendChild(noPet);
        }else if(element.onePet != 0 || element.onePet != null ){
          const pet = document.createElement("p")
          pet.innerHTML ="Pet: "+ element.onePet.name + ", Raza: "+ element.onePet.raza;
          divEachPerson.appendChild(pet);
        }
      }); 
    }
  } catch (err) {
    console.error("we couldn't fech the data,", err);
  }
}
