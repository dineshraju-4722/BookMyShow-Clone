import { Button } from 'antd'

export default function Navbar() {
    return (
        <section className="w-[100%] h-[5rem] bg-[#FFFFFF] border-box px-[5vw] flex justify-between items-center">
            <p className="w-[7rem] bg-green-500">logo here</p>
            <section  className=' flex w-[40vw] border border-black h-[50%] border-box p-[0.4rem] rounded-sm'>
                <svg className='w-[2rem] h-[100%] mr-[0.3rem]' xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 640"><path d="M480 272C480 317.9 465.1 360.3 440
                 394.7L566.6 521.4C579.1 533.9 579.1 554.2 566.6 566.7C554.1 579.2 533.8 579.2 521.3 566.7L394.7 440C360.3 
                 465.1 317.9 480 272 480C157.1 480 64 386.9 64 272C64 157.1 157.1 64 272 64C386.9 64 480 157.1 480 272zM272 416C351.5 416 416 351.5 416 272C416 192.5 351.5 128
                 272 128C192.5 128 128 192.5 128 272C128 351.5 192.5 416 272 416z"/>
                 </svg>
<input className='outline-none'  type='search' placeholder='Search for moveis' />
            </section>
            
            <section className=" w-[14rem] flex items-center justify-between">
                <section className='flex items-center mb-[0]'>
                    <span className='mr-[0.8rem]'>chitoo</span>
                    <span>
                        <svg className='w-[2rem]' xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 640">
                            <path d="M297.4 438.6C309.9 451.1 330.2 451.1 342.7 438.6L502.7 278.6C515.2 266.1 
                    515.2 245.8 502.7 233.3C490.2 220.8 469.9 220.8 457.4 233.3L320 370.7L182.6 233.4C170.1
                     220.9 149.8 220.9 137.3 233.4C124.8 245.9 124.8 266.2 137.3 278.7L297.3 438.7z" />
                        </svg>
                    </span>
                </section>
                <Button type='primary'>signin</Button>
                <svg xmlns="http://www.w3.org/2000/svg" className='w-[2rem]'
                    viewBox="0 0 640 640"><path d="M96 160C96 142.3 110.3 128 128 128L512 128C529.7 128 544 142.3 544 160C544 
                177.7 529.7 192 512 192L128 192C110.3 192 96 177.7 96 160zM96 320C96 302.3 110.3 288 128 288L512 288C529.7 
                288 544 302.3 544 320C544 337.7 529.7 352 512 352L128 352C110.3 352 96 337.7 96 320zM544 480C544 497.7 529.7 512 
                512 512L128 512C110.3 512 96 497.7 96 480C96 462.3 110.3 448 128 448L512 448C529.7 448 544 462.3 544 480z" />
                </svg>
            </section>
        </section>
    )
}