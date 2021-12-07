const checkLogined = async () => {
    try {
        await axios.post(`./login`);
        window.location.href = "./login";
    }
    catch (error) {
        
    }
}

const validateLoginForm = async () => {
    //Hiên thị thông báo lỗi
    const loginErrorMessage = document.querySelector('#login_error');
    const passwordErrorMessage = document.querySelector('#password_error');

    //Lấy dữ liệu usernmae và password
    const username = document.querySelector('#username').value;
    const password = document.querySelector('#password').value;
    //Thực hiện request
    try {
         await axios.post(`./login?username=${username}&password=${password}`);
         window.location.href = "./login";
    } catch (error) {
        //Khi có lỗi thì 
           const data = error.response.data;
            console.log(data);
            loginErrorMessage.innerHTML=data[0];
            passwordErrorMessage.innerHTML=data[1];
     
    }
}

//Luôn luôn chạy hàm kiểm tra đã đăng nhập hay chưa (đã có session chưa), để tự redirect sang trang index (list)
checkLogined();


