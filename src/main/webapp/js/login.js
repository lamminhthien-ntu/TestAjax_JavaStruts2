const validateLoginForm = async () => {
    const loginErrorMessage = document.querySelector('#login_error');
    const passwordErrorMessage = document.querySelector('#password_error');
    const username = document.querySelector('#username').value;
    const password = document.querySelector('#password').value;
    try {
         await axios.post(`./login?username=${username}&password=${password}`);
         window.location.href = "./login";
        //console.log("123");
        //console.log(data);

    } catch (error) {
       if (typeof(error.response.data) != "undefined")
       {
           const data = error.response.data;
            console.log(data);
            loginErrorMessage.innerHTML=data[0];
            passwordErrorMessage.innerHTML=data[1];
       }
       
            
    }
}
// function validateLoginForm(){
//     console.log("abc");
// }


