const uri = "http://localhost:4567";
var APIRedirect = "";
function loadValues(){
    var consulta;
    consulta = document.getElementById("archivo").value;
    //var URL_API = "http://localhost:4567/search";
    var URL_API = "http://localhost:35000/search"+ consulta;
    console.log(URL_API);
    axios.get(URL_API, {
                       params: {
                         consulta: this.consulta
                       }
                     })
        .then(function(res){
            console.log(res);
        })
        .catch(function (error) {
            console.log(error)
        })
}