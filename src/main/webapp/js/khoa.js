const formDOM = document.querySelector('#loginForm');
const studentListDOM = document.querySelector('#student-list');

formDOM.addEventListener('submit', async (event) => {
    event.preventDefault();
      try{
        //Include json page through Ajax
        const { data } = await axios.get('./khoa/index');
        //console.log(data);
        const allStudent = data.map((student) => {
          const {name,id,email,branch,percentage,phone} = student;
          return `
            <p>${name} ${id} ${branch} ${percentage} ${email} ${phone}<p>
          `
        }).join(' '); 
        studentListDOM.innerHTML = allStudent;
      }
      catch(error) {
          //errorMsgDOM.textContent = error.response.data.message;
      }
      
});
