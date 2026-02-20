import { Form, Modal, Tabs } from "antd";
import { Children, useState } from "react";

export default function Location({ setLocation }) {
  
  const [showCities, setShowCities] = useState(false);

  return (
    <Modal
      open={true}
      onCancel={() => setLocation(false)}
      footer={null}
      maskClosable={true}
      // closable={true}
      closeIcon={null}
      width={1000}
      // height={300}
    >
      <div className="flex flex-col items-center justify-center gap-5">
        <input
          type="text"
          placeholder="Search for your city"
          className="w-full h-[2rem] border-2 border-gray-300 rounded-md p-5 outline-none"
        />
        <p className="font-bold ">Popular Cities</p>
        <section className="flex">
          <section className="flex flex-col justify-center items-center">
            <i className="fa-solid fa-building-columns font-[3rem]"></i>
            <span className="ml-2">Chittoor</span>
          </section>
          <section className="flex flex-col justify-center items-center">
            <i class="fa-solid fa-building"></i>
            <span className="ml-2">Tirupathi</span>
          </section>
        </section>
        {showCities && <section className="flex flex-col gap-5 max-h-[20rem] overflow-y-scroll">
          <span className="font-bold text-center">Other Cities</span>
          <section className="flex flex-wrap gap-x-10 gap-y-3 justify-center">
            <span>Hyderabad</span>
            <span>Vijayawada</span>
            <span>Guntur</span>
            <span>Vizag</span>
            <span>Banglore</span>
            <span>Chennai</span>  
            <span>Hyderabad</span>
            <span>Vijayawadafrghjjjjjjjjj</span>
            <span>Guntur</span>
            <span>Vizag</span>
            <span>Banglore</span>
            <span>Chennai</span>  
            <span>Hyderabad</span>
            <span>Vijayawada</span>
            <span>Guntur</span>
            <span>Vizag</span>
            <span>Banglore</span>
            <span>Chennai</span>  
            <span>Hyderabad</span>
            <span>Vijayawada</span>
            <span>Guntur</span>
            <span>Vizag</span>
            <span>Banglore</span>
            <span>Chennai</span>  
          </section>
        </section>
        }
        <span className="font-bold text-red-500" onClick={()=> setShowCities(!showCities)}> {showCities ? "Hide All Cities" : "Show All Cities"}</span>
        
      </div>
    </Modal>
  );
}
