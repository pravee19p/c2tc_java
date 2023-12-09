import React from 'react';
import { BrowserRouter as Router, Route,Switch } from 'react-router-dom';
import Add from './component/Add';
import Select from './component/Select';
import Delete from './component/Delete';
import Update from './component/Update';
import Nav from './component/Nav'; // Assuming Nav has the navigation links
import Selectid from './component/Selectid';
import Shoppingmall from './component/Shoppingmall';



function App() {
  return (
  
    <Router>
      
       <Switch>
       
         <Route exact path="/" component={Shoppingmall} />
         <Route path="/admin" component={Add} />
            <Route path="/select" component={Select} />
            <Route path="/selectbyid" component={Selectid} />
            <Route path="/delete" component={Delete} />
            <Route path="/update" component={Update} />
            <Route path="/home" component={Shoppingmall} />
            
            
           
      </Switch>
     </Router> 





    // <Router>
    //   <Nav /> 
    //    <Switch>
       
    //     <Route exact path="/" component={Home} />
    //     <Route path="/select" component={Select} />
    //     <Route path="/selectbyid" component={Selectid} />
    //     <Route path="/delete" component={Delete} />
    //     <Route path="/update" component={Update} />
    //   </Switch>
    //  </Router> 
  );
}

export default App;
