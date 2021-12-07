const formDOM = document.querySelector('#loginForm');
const studentListDOM = document.querySelector('#student-list');

formDOM.addEventListener('submit', async (event) => {
    event.preventDefault();
      try{
        //Include json page through Ajax
        const { data } = await axios.get('./khoa/index');
        console.log(data);
        for (var i=0; i<data.length; i++)
        {
          var tr = document.createElement("tr");
          var td_id = document.createElement("td");
          var td_name = document.createElement("td");
          var td_branch = document.createElement("td");
          var td_phone = document.createElement("td");
          var td_percentage = document.createElement("td");
          var td_email = document.createElement("td");
          tr.appendChild(td_id);
          tr.appendChild(td_name);
          tr.appendChild(td_branch);
          tr.appendChild(td_phone);
          tr.appendChild(td_percentage);
          tr.appendChild(td_email);
          var name = document.createTextNode(data[i].name);
          var id = document.createTextNode(data[i].id);
          var branch = document.createTextNode(data[i].branch);
          var percentage = document.createTextNode(data[i].percentage);
          var phone = document.createTextNode(data[i].phone);
          var email = document.createTextNode(data[i].email);
          td_id.appendChild(id);
          td_name.appendChild(name);
          td_branch.appendChild(branch);
          td_percentage.appendChild(percentage);
          td_phone.appendChild(phone);
          td_email.appendChild(email);
          studentListDOM.appendChild(tr);
        }
        //studentListDOM.innerHTML = allStudent;
      }
      catch(error) {
          //errorMsgDOM.textContent = error.response.data.message;
      }
      
});
