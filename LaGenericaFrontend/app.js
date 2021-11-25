const express = require('express');
const path = require('path');
const bodyParser = require('body-parser')
const app = express();
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended:false}));
app.use(express.static(path.join(__dirname,'public')));
const http = require("http");



app.post('/authenticate',(req,res) => { 
  const {username,password} =req.body;
      if(username=="admininicial"){
          if(password=="admin123456"){
            res.sendFile(path.join(__dirname, '//public/menu.html'));
          }else{
            res.status(500).send('Error en la contraseña');
          }
      }else{
          res.status(500).send('El usuario no existe');
      } 
  });

app.listen(3000,() => {
    console.log('Servidor Inicia puerto 3000');
});
module.exports=app;