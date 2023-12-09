
import React, { useEffect,useState } from "react";
import axios from 'axios';
import  Nav from './Nav.js';
import './Addcss.css'; 


function Select()
{
    const [posts,setposts]=useState([0]);
    
    useEffect(()=>{
        axios.get('http://localhost:8080/admins')
        .then(res=>{
            console.log(res)
            setposts(res.data)
        })
        .catch(err=>
            {
                console.log(err)
            })
            
    },[])
    return(
        <div>
            <Nav/>
         <center>
         <table>
      
         <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Password</th>
            <th>Mall</th>
            <th>Phone</th>
        </tr>
    
   
        {
            posts.map(post => (
                <tr key={post.id}>
                    <td>{post.id}</td>
                    <td>{post.name}</td>
                    <td>{post.password}</td>
                    <td>{post.mall}</td>
                    <td>{post.phone}</td>
                </tr>
            ))
        }
    
        </table>   
        </center>
       
    </div>
    )
}export default Select