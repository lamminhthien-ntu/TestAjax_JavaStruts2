const formDOM = document.querySelector('#loginForm');
const errorMsgDOM = document.querySelector('#error-msg');


formDOM.addEventListener('submit', async (event) => {
    event.preventDefault();
    errorMsgDOM.textContent = '';
      try{
        const { data } = await axios.get('./khoa/index');
        console.log(data);
        errorMsgDOM.textContent = data.message;
      }  
      catch(error) {
          //errorMsgDOM.textContent = error.response.data.message;
      }
});
