import React, { useState } from "react";
import './Addcss.css';
import  Nav from './Nav.js';
import axios from 'axios';


function Add() {
    
    const [name, setName] = useState("");
    const [password, setPassword] = useState("");
    const [mall, setMall] = useState("");
    const [phone, setPhone] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        const obj = {
            
            name: name,
            password: password,
            mall: mall,
            phone: phone,
        };
        axios.post('http://localhost:8080/admins/add', obj)
            .then(res => {
                console.log(res);
                // Handle the response or perform necessary actions
            })
            .catch(err => {
                console.log(err);
            });
      
    };

    return (
        <div>
           
           <Nav/>
            <center>
                <form className="form">
                    <h1>ADD FORM</h1>
                    <div>
                       
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
                        <button type="submit" className="btn" onClick={handleSubmit}>ADD</button>
                    </div>
                </form>
            </center>
        </div>
    );
}

export default Add;
