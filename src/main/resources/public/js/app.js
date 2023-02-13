const uri = "http://localhost:4567";
function loadValues(){
    var consulta;
    consulta = document.getElementById("archivo").value;
    var URL_API = "http://localhost:4567/search"
    axios.get(URL_API)
        .then(function(res){
            console.log(res);
        })
        .catch(function (error) {
            console.log(error)
        })
}