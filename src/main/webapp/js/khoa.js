const formDOM = document.querySelector('#loginForm');
const errorMsgDOM = document.querySelector('#error-msg');


formDOM.addEventListener('submit', async (event) => {
    event.preventDefault();
    errorMsgDOM.textContent = '';
      try{
        const { data } = await axios.get('./khoa/index');
        console.log(data);
        console.log(data.a);
        console.log(data.b);
        console.log(data.c);
      }  
      catch(error) {
          //errorMsgDOM.textContent = error.response.data.message;
      }
});
