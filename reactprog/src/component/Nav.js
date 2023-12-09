import React from "react";
import './Addcss.css'; 
import { Link } from "react-router-dom";
const Nav=()=>{
    return(

        <div>
            <div class="topcontainer">
            <div class="left"><p>MALL ADMIN </p></div>
            <div><Link to="/home" class="right">HOME</Link></div> 
            
            </div>
            <nav className="navbar">
            <div><Link  to="/admin" className="custom-link">ADD </Link></div>
            <div><Link to="/select" className="custom-link">SHOW</Link></div>
            <div><Link  to="/selectbyid" className="custom-link">SELECT</Link></div>
            <div><Link to="/delete" className="custom-link">DELETE</Link></div>
            <div><Link to="/update" className="custom-link">UPDATE</Link></div>
            </nav>
        </div>
    )
}
export default Nav