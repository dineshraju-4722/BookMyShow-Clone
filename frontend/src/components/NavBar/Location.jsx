import { Form, Modal, Tabs } from "antd";
import { Children } from "react";

export default function Location({setLocation}){
    

    return <Modal 
      
    open={true}
    onCancel={()=>setLocation(false)}
    footer={null}
    maskClosable={true}
    // closable={true}
    closeIcon={null}
    width={1000}
    height={400}
    >

      <input type="text" placeholder="Enter your location" className="w-full h-[2rem] border-2 border-gray-300 rounded-md p-1 outline-none mb-4" />
      
      <p className="font-bold ">Popular Cities</p>

    </Modal>
}