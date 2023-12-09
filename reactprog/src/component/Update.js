import React, { useState } from "react";
import './Addcss.css';
import axios from 'axios';
import  Nav from './Nav.js';

function Update()
{
    const [id, setId] = useState("");
    const [name, setName] = useState("");
    const [password, setPassword] = useState("");
    const [mall, setMall] = useState("");
    const [phone, setPhone] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        const obj = {
            id: id,
            name: name,
            password: password,
            mall: mall,
            phone: phone,
        };
        axios.put(`http://localhost:8080/admins/update/${id}`,obj)
            .then(res => {
                console.log(res);
                // Handle the response or perform necessary actions
            })
            .catch(err => {
                console.log(err);
            });
      
    };

return(
    
    
    <div >
       <Nav/>
         <center>
                <form className="formupdate">
                    <h1>UPDATE FORM</h1>
                    <div>
                        <label>ID</label>
                        <input className="c" type="text" placeholder="ID"
                            name="id" value={id} onChange={(e) => setId(e.target.value)} />
                        <br />
                        <label>NAME</label>
                        <input className="cl" type="text" placeholder="NAME"
                            name="name" value={name} onChange={(e) => setName(e.target.value)} />
                        <br />
                        <label>PASSWORD</label>
                        <input className="cl1" type="text" placeholder="PASSWORD"
                            name="password" value={password} onChange={(e) => setPassword(e.target.value)} />
                        <br />
                        <label>MALL NAME</label>
                        <input className="cl2" type="text" placeholder="MALL"
                            name="mall" value={mall} onChange={(e) => setMall(e.target.value)} />
                        <br />
                        <label>PHONE</label>
                        <input className="cl3" type="text" placeholder="phone number"
                            name="phone" value={phone} onChange={(e) => setPhone(e.target.value)} />
                        <br />
                        <button type="submit"className="btn" onClick={handleSubmit}>UPDATE</button>
                    </div>
                </form>
            </center>

    </div>
    
);}

export default Update