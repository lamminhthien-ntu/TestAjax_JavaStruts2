console.log("Fuck you tomcat!!!");

const validateRegisterForm = async () => {
    //Hiên thị thông báo lỗi
    const userNameErrorMessage = document.querySelector('#username_error');
    const passwordErrorMessage = document.querySelector('#password_error');

    const formDOM = document.querySelector('#registerForm');
    const formData = new FormData(formDOM);
    //Thực hiện request
    try {
         await axios.post(`./register`,formData);
         window.location.href = "./register_success.html";
    } catch (error) {
        //Khi có lỗi thì 
           const data = error.response.data;
            console.log(data);
            userNameErrorMessage.innerHTML=data[0];
            passwordErrorMessage.innerHTML=data[1];
     
    }
}




