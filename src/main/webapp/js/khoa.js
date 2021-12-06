const formDOM = document.querySelector('#loginForm');
//const errorMsgDOM = document.querySelector('#error-msg');
const name = document.querySelector('#name');
const email = document.querySelector('#email');
const phone = document.querySelector('#phone');
const percentage = document.querySelector('#percentage');


formDOM.addEventListener('submit', async (event) => {
    event.preventDefault();
    //errorMsgDOM.textContent = '';
      try{
        //Include json page through Ajax
        const { data } = await axios.get('./khoa/index');
        console.log(data);
        //errorMsgDOM.textContent = data.message;
        //Return data from server to html
        name.textContent = data.name;
        email.textContent = data.email;
        phone.textContent = data.phone;
        percentage.textContent = data.percentage;
      }  
      catch(error) {
          //errorMsgDOM.textContent = error.response.data.message;
      }
});
