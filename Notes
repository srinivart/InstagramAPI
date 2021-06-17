# InstagramAPI

https://developers.facebook.com/docs/instagram-basic-display-api
https://developers.facebook.com/docs/instagram-basic-display-api/getting-started

https://developers.facebook.com/apps/2261534857310267/add/



https://www.srinivart.com/auth/


--->



https://api.instagram.com/oauth/authorize
  ?client_id=514475083103764
  &redirect_uri=https://www.srinivart.com/auth/
  &scope=user_profile,user_media
  &response_type=code
  
  
  
https://www.srinivart.com/tdb_templates/author-template-artist-pro/?
code=AQAjhgjvFzm0NlnLrGMP6ujK-qWW_cJn-lL2p5mNaJnBcjcLCuRshYj1sBBvep73pI53842N_HoQjHYSU2RQxj_x3hyNvwp_CcvZut_31VyrGIdg9bNegtTAXfZj_YGQiJ-X-czGH0ZoVdWSe9rulUUjgMRj7U7zOg8K3BBz3Ro0BRQpll3CqAchbogMvlXujDRCuiJpc4E26o64T6It__kB0L9vpeO7X_jZZuuw-FRmrA

#_  
 
 
 
 
 GET The access Token through Terminal
-------------------------------------

curl -X POST \
  https://api.instagram.com/oauth/access_token \
  -F client_id=514475083103764 \
  -F client_secret=a27ddd4430dd0f374300a2e5cc61edf7 \
  -F grant_type=authorization_code \
  -F redirect_uri=https://www.srinivart.com/auth/ \
  -F code=AQAjhgjvFzm0NlnLrGMP6ujK-qWW_cJn-lL2p5mNaJnBcjcLCuRshYj1sBBvep73pI53842N_HoQjHYSU2RQxj_x3hyNvwp_CcvZut_31VyrGIdg9bNegtTAXfZj_YGQiJ-X-czGH0ZoVdWSe9rulUUjgMRj7U7zOg8K3BBz3Ro0BRQpll3CqAchbogMvlXujDRCuiJpc4E26o64T6It__kB0L9vpeO7X_jZZuuw-FRmrA




{"access_token": "IGQVJVTGU2X1NkdXFOclBfcmJiSTFZAeHU3NFRxdThkMnFUczdlMDIxdTBfRXk1Nk45SGNSZAFRZAcUZAHYWI0T29wYmc1OTJxZAEFsYUJFRVJlbTBOVTM3dGJuZAXBDNE92T2FuRmJWNGQxVDFJWXBDb2dXQ19CdnFUZAXUxaDVz", "user_id": 17841403815449847}








-->
Get username


curl -X GET \
  'https://graph.instagram.com/17841403815449847?fields=id,username&access_token=IGQVJVTGU2X1NkdXFOclBfcmJiSTFZAeHU3NFRxdThkMnFUczdlMDIxdTBfRXk1Nk45SGNSZAFRZAcUZAHYWI0T29wYmc1OTJxZAEFsYUJFRVJlbTBOVTM3dGJuZAXBDNE92T2FuRmJWNGQxVDFJWXBDb2dXQ19CdnFUZAXUxaDVz'
  
  
{"id":"4010113012413764","username":"srinivart"}







--->

curl -X GET \
  'https://graph.instagram.com/17917513480681591?fields=id,media_type,media_url,username,timestamp&access_token=IGQVJVTGU2X1NkdXFOclBfcmJiSTFZAeHU3NFRxdThkMnFUczdlMDIxdTBfRXk1Nk45SGNSZAFRZAcUZAHYWI0T29wYmc1OTJxZAEFsYUJFRVJlbTBOVTM3dGJuZAXBDNE92T2FuRmJWNGQxVDFJWXBDb2dXQ19CdnFUZAXUxaDVz'





Get single Id
---------------->

curl -X GET \
  'https://graph.instagram.com/17917513480681591?fields=id,media_type,media_url&access_token=IGQVJVTGU2X1NkdXFOclBfcmJiSTFZAeHU3NFRxdThkMnFUczdlMDIxdTBfRXk1Nk45SGNSZAFRZAcUZAHYWI0T29wYmc1OTJxZAEFsYUJFRVJlbTBOVTM3dGJuZAXBDNE92T2FuRmJWNGQxVDFJWXBDb2dXQ19CdnFUZAXUxaDVz'



{
    "id": "17917513480681591",
    "media_type": "IMAGE",
    "media_url": "https://scontent.cdninstagram.com/v/t51.29350-15/200237138_125086483086409_9210109075071664455_n.jpg?_nc_cat=110&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=_8lB2IzIMD4AX9T61nx&_nc_ht=scontent.cdninstagram.com&oh=d774452046eb7574af730b58b45ac384&oe=60D0133E"
}







--->
curl -X GET \
  'https://graph.instagram.com/me/media?fields=id&access_token=IGQVJVTGU2X1NkdXFOclBfcmJiSTFZAeHU3NFRxdThkMnFUczdlMDIxdTBfRXk1Nk45SGNSZAFRZAcUZAHYWI0T29wYmc1OTJxZAEFsYUJFRVJlbTBOVTM3dGJuZAXBDNE92T2FuRmJWNGQxVDFJWXBDb2dXQ19CdnFUZAXUxaDVz'
  
  
Ex: output
-----
  
  {
    "data": [
        {
            "id": "17917513480681591"
        },
        {
            "id": "17915548519657304"
        },
        {
            "id": "17869289123382873"
        },
        {
            "id": "17916381475652385"
        },
        {
            "id": "17873972485931435"
        },
        {
            "id": "18037215217274463"
        }
    ]
    
    
    
    
    
    
--->    
    curl -X GET \
  'https://graph.instagram.com/me/media?fields=id&access_token=IGQVJVTGU2X1NkdXFOclBfcmJiSTFZAeHU3NFRxdThkMnFUczdlMDIxdTBfRXk1Nk45SGNSZAFRZAcUZAHYWI0T29wYmc1OTJxZAEFsYUJFRVJlbTBOVTM3dGJuZAXBDNE92T2FuRmJWNGQxVDFJWXBDb2dXQ19CdnFUZAXUxaDVz'
 
    
  
curl -X GET \
  'https://graph.instagram.com/me/media?fields=id,media_type,media_url&access_token=IGQVJVTGU2X1NkdXFOclBfcmJiSTFZAeHU3NFRxdThkMnFUczdlMDIxdTBfRXk1Nk45SGNSZAFRZAcUZAHYWI0T29wYmc1OTJxZAEFsYUJFRVJlbTBOVTM3dGJuZAXBDNE92T2FuRmJWNGQxVDFJWXBDb2dXQ19CdnFUZAXUxaDVz'


output
-----
{
    "data": [
        {
            "id": "17917513480681591",
            "media_type": "IMAGE",
            "media_url": "https://scontent.cdninstagram.com/v/t51.29350-15/200237138_125086483086409_9210109075071664455_n.jpg?_nc_cat=110&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=_8lB2IzIMD4AX9T61nx&_nc_ht=scontent.cdninstagram.com&oh=d774452046eb7574af730b58b45ac384&oe=60D0133E"
        }
        {
            "id": "17915548519657304",
            "media_type": "VIDEO",
            "media_url": "https://video.cdninstagram.com/v/t50.2886-16/186555036_219177153014647_7769407202074558708_n.mp4?_nc_cat=109&vs=17890770593131170_1574622187&_nc_vs=HBksFQAYJEdKeWFIZ3QzSzFrb1Y4Y0FBUFFBQkt1dmV0SnJia1lMQUFBRhUAAsgBABUAGCRHSjBrRFFzeHFSMGM4ZHdDQU1LQXZINW9TRVpmYmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMRUAACbE%2B8XL7uPHPxUCKAJDMywXQEtIcrAgxJwYEmRhc2hfYmFzZWxpbmVfMl92MREAdeoHAA%3D%3D&ccb=1-3&_nc_sid=59939d&efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjcyMC5mZWVkIn0%3D&_nc_ohc=naSgPhSOgtEAX8cKtMh&_nc_ht=video.cdninstagram.com&oh=528373f54e550de6927529709bcbdd8d&oe=60CF555E&_nc_rid=58e0117d6a"
        },
        
        




Get only images
----------->

curl -X GET \
  'https://graph.instagram.com/me/media?fields=id,media_type,media_url&access_token=IGQVJVTGU2X1NkdXFOclBfcmJiSTFZAeHU3NFRxdThkMnFUczdlMDIxdTBfRXk1Nk45SGNSZAFRZAcUZAHYWI0T29wYmc1OTJxZAEFsYUJFRVJlbTBOVTM3dGJuZAXBDNE92T2FuRmJWNGQxVDFJWXBDb2dXQ19CdnFUZAXUxaDVz'







Code
---->
JSONArray data = myResponse.getJSONArray("data");
        System.out.println(data);
        
        
  
  
[{"media_type":"IMAGE","id":"17917513480681591","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/200237138_125086483086409_9210109075071664455_n.jpg?_nc_cat=110&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=_8lB2IzIMD4AX9T61nx&_nc_ht=scontent.cdninstagram.com&oh=d774452046eb7574af730b58b45ac384&oe=60D0133E"},{"media_type":"VIDEO","id":"17915548519657304","media_url":"https:\/\/video.cdninstagram.com\/v\/t50.2886-16\/186555036_219177153014647_7769407202074558708_n.mp4?_nc_cat=109&vs=17890770593131170_1574622187&_nc_vs=HBksFQAYJEdKeWFIZ3QzSzFrb1Y4Y0FBUFFBQkt1dmV0SnJia1lMQUFBRhUAAsgBABUAGCRHSjBrRFFzeHFSMGM4ZHdDQU1LQXZINW9TRVpmYmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMRUAACbE%2B8XL7uPHPxUCKAJDMywXQEtIcrAgxJwYEmRhc2hfYmFzZWxpbmVfMl92MREAdeoHAA%3D%3D&ccb=1-3&_nc_sid=59939d&efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjcyMC5mZWVkIn0%3D&_nc_ohc=naSgPhSOgtEAX8cKtMh&_nc_ht=video.cdninstagram.com&oh=528373f54e550de6927529709bcbdd8d&oe=60CF555E&_nc_rid=0d847bd948"},{"media_type":"IMAGE","id":"17869289123382873","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/183654676_498180161327775_3506666685195885816_n.jpg?_nc_cat=103&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=mk29TPrZceoAX_0F1_G&_nc_ht=scontent.cdninstagram.com&oh=edf53cca8ee2d670b47d84de8a1efa44&oe=60CF145C"},{"media_type":"IMAGE","id":"17916381475652385","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/183574766_4104574689589225_5321512197113513699_n.jpg?_nc_cat=108&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=_sw-4cuCpR8AX9OkDxS&_nc_ht=scontent.cdninstagram.com&oh=a36fa14e430f997c868d504e0a1d4a1d&oe=60CF1EC3"},{"media_type":"IMAGE","id":"17884871045173114","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/172757244_306835777567354_7375959445256221614_n.jpg?_nc_cat=103&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=VtH7wnoIS-oAX_Ey2WY&_nc_ht=scontent.cdninstagram.com&oh=4a7f2c5e3c937428979ccad972165ea9&oe=60CEF82D"},{"media_type":"VIDEO","id":"17864880524503094","media_url":"https:\/\/video.cdninstagram.com\/v\/t50.2886-16\/171080781_1134427510359668_3000689457418316961_n.mp4?_nc_cat=107&vs=17956790878422214_711035160&_nc_vs=HBksFQAYJEdFMThNZ3AwUnNkOHdRY0VBS0dzcmNZcGw2UXBia1lMQUFBRhUAAsgBABUAGCRHSHYxTndyNnpoS1lwVWdEQUNJbDFLdFBPTVVuYmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMRUAACaMibmo5OblPxUCKAJDMywXQDV3S8an754YEmRhc2hfYmFzZWxpbmVfMV92MREAdeoHAA%3D%3D&ccb=1-3&_nc_sid=59939d&efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjcyMC5mZWVkIn0%3D&_nc_ohc=s7n9nWtTgOMAX_o8oF5&_nc_ht=video.cdninstagram.com&oh=9717c0ff92abc57cb908368a935936e4&oe=60D04918&_nc_rid=50ab2390ed"},{"media_type":"CAROUSEL_ALBUM","id":"17931958087485031","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/169492811_292544248925418_1301695094144204787_n.jpg?_nc_cat=101&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=WbtDBz5Pm7EAX_oRSME&_nc_ht=scontent.cdninstagram.com&oh=bce8d59e9e77fd40f80996ac8546217a&oe=60CF333F"},{"media_type":"CAROUSEL_ALBUM","id":"17842370603577804","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/167525498_456926338907139_5226215337216603604_n.jpg?_nc_cat=100&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=l8zJxRL2q2UAX94jnAK&_nc_ht=scontent.cdninstagram.com&oh=5c5937a61b3beccf92e171b727c0d6ba&oe=60D0794C"},{"media_type":"IMAGE","id":"17907761878742132","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/166467399_958498878251518_2141374974591048302_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=odXCTLQ8NbYAX-RisDR&_nc_ht=scontent.cdninstagram.com&oh=5bcf22bb01eeacecb6905bdeb24e1282&oe=60D00A22"},{"media_type":"IMAGE","id":"18145941181092585","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/164519843_2564767820491042_5062518502525177182_n.jpg?_nc_cat=103&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=guL9QTScbqcAX8WJBEY&_nc_ht=scontent.cdninstagram.com&oh=7a829903fe7ce34fdf7a18380c9da19f&oe=60CFF284"},{"media_type":"IMAGE","id":"17952820492423789","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/162548259_250518436774453_4117774074674668624_n.jpg?_nc_cat=100&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=6hRenGe5R-cAX_FyMdI&_nc_ht=scontent.cdninstagram.com&oh=4c66f02360201568fca4ecfd38053b1d&oe=60CFDB9E"},{"media_type":"CAROUSEL_ALBUM","id":"17880609851104743","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/159906217_439526523988957_8574482885248143458_n.jpg?_nc_cat=100&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=X6GWgBk2Od0AX8Ga-4h&_nc_ht=scontent.cdninstagram.com&oh=f79bdaac8d6ddf02c2f2a67e318e2296&oe=60CF939B"},{"media_type":"CAROUSEL_ALBUM","id":"18144382009176557","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/158752115_147612183888641_3386537326100743336_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=1BNyFrVBOEQAX_gZVqS&_nc_ht=scontent.cdninstagram.com&oh=c665af12cab44cede84d84bc410059f9&oe=60D09F6C"},{"media_type":"VIDEO","id":"17893577965932786","media_url":"https:\/\/video.cdninstagram.com\/v\/t50.2886-16\/157927109_257333102656665_8667639988911738656_n.mp4?_nc_cat=105&vs=17992968115323200_1903223791&_nc_vs=HBksFQAYJEdNWEdhUW1aUEN3SUNfb0FBQ0FQRHBTbHBFbDRia1lMQUFBRhUAAsgBABUAGCRHTTZfYkFuLXh3eVJ6ZHdDQUhOZk9XWlBBSjVIYmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMRUAACaA6PWfyqD2PxUCKAJDMywXQE4AAAAAAAAYEmRhc2hfYmFzZWxpbmVfMV92MREAdeoHAA%3D%3D&ccb=1-3&_nc_sid=59939d&efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjcyMC5mZWVkIn0%3D&_nc_ohc=LOmIPWje634AX_cZ71q&_nc_ht=video.cdninstagram.com&oh=5699506119ffe8b9d5c7ff77a44cd0ad&oe=60D0C304&_nc_rid=f9aab1fff1"},{"media_type":"IMAGE","id":"17920651183555479","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/151213133_472587774119058_2353096556411476126_n.jpg?_nc_cat=100&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=ahUHLoaWi8MAX-7GuIr&_nc_ht=scontent.cdninstagram.com&oh=bd9d0ceb547d3531d55269dcea9eda27&oe=60D034BB"},{"media_type":"IMAGE","id":"17884806719025826","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/149795089_1126977277735259_7964858616066435915_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=ACA7C4Md6xEAX8uEgB4&_nc_oc=AQmeFSUB962RFa3BxwMPoKmGAUyns33PMYtfGO-EaQtAUQEKV3DYhmnV_c_TdczIOmY&_nc_ht=scontent.cdninstagram.com&oh=a88942dfe2142ffa81392b139f41f20c&oe=60D06030"},{"media_type":"VIDEO","id":"17923830652523266","media_url":"https:\/\/video.cdninstagram.com\/v\/t50.2886-16\/149340071_899768370564049_5667348903992560377_n.mp4?_nc_cat=106&vs=17895118639876994_516438930&_nc_vs=HBksFQAYJEdLZS01Z2pSaXh1bVZUSURBUGtLclNETmQ2Wk9ia1lMQUFBRhUAAsgBABUAGCRHR3IzOWdqN3NPUG4zcjhBQUwybnpncmN6dmd6YmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMRUAACaEnsjS%2FuDJPxUCKAJDMywXQEpIcrAgxJwYEmRhc2hfYmFzZWxpbmVfMV92MREAdeoHAA%3D%3D&ccb=1-3&_nc_sid=59939d&efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjcyMC5mZWVkIn0%3D&_nc_ohc=lwg4613nBRcAX_nIIl_&_nc_ht=video.cdninstagram.com&oh=7ef27e2fa055bf985f0122a45ee7eeb9&oe=60D01037&_nc_rid=0151f90331"},{"media_type":"CAROUSEL_ALBUM","id":"17846803877517781","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/147291740_440654180490332_8916420240204236129_n.jpg?_nc_cat=107&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=VFJHxidZIGkAX_sK5rW&_nc_ht=scontent.cdninstagram.com&oh=7c038b3b01547c6481df1b66211472e8&oe=60CF439C"},{"media_type":"IMAGE","id":"17893337905811043","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/139361089_2165846213548917_6078469107930515198_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=viQVcTd4mAAAX8iS4Ye&_nc_ht=scontent.cdninstagram.com&oh=68c28b4f2978110c247bf314335690b8&oe=60CF2489"},{"media_type":"VIDEO","id":"17875728521133384","media_url":"https:\/\/video.cdninstagram.com\/v\/t50.2886-16\/137559752_1819013941596873_2061792762409868699_n.mp4?_nc_cat=102&vs=17981656714331840_3794571270&_nc_vs=HBksFQAYJEdNal9NZ2pKa3RRdlluWUdBSnRkNmZPWDlad2Nia1lMQUFBRhUAAsgBABUAGCRHRTI1U2doNmRzZXlKQklEQUF6aWFEN3R4RmwwYmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMRUAACaA94DRlY7xPxUCKAJDMywXQEAqn752yLQYEmRhc2hfYmFzZWxpbmVfMV92MREAdeoHAA%3D%3D&ccb=1-3&_nc_sid=59939d&efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjcyMC5mZWVkIn0%3D&_nc_ohc=NfouLv1bi-gAX-KnNA5&_nc_ht=video.cdninstagram.com&oh=5bba024cef31704f09dd3f2801d2b8cb&oe=60D0403D&_nc_rid=fccc82cc0c"},{"media_type":"IMAGE","id":"17951629498392423","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/137020816_1115311572253622_2427105191409170477_n.jpg?_nc_cat=111&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=zhVBjSxnJ1gAX-oos39&_nc_ht=scontent.cdninstagram.com&oh=443d0341d14c92c1cb424c06156914a1&oe=60CEF293"},{"media_type":"IMAGE","id":"18125140984162598","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/136778363_3539028982886033_3344332299761901463_n.jpg?_nc_cat=109&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=E87W_10NJdwAX_etmNL&_nc_ht=scontent.cdninstagram.com&oh=28424f93a59f21051c33a48c05ff25b4&oe=60CF9A61"},{"media_type":"VIDEO","id":"17885151628783256","media_url":"https:\/\/video.cdninstagram.com\/v\/t50.2886-16\/122155934_1067120870393852_6659791995877343761_n.mp4?_nc_cat=100&vs=17900517811567342_1431527060&_nc_vs=HBksFQAYJEdKN3pSd2Y4aDJsd2lzb0RBQkZDUWdDSlZXeGNia1lMQUFBRhUAAsgBABUAGCRHSW5XUndlWVlweVpEandDQVBRMHZVZGRWRmxnYmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMRUAACbc%2BMG9opvMPxUCKAJDMywXQD5MzMzMzM0YEmRhc2hfYmFzZWxpbmVfMV92MREAdeoHAA%3D%3D&ccb=1-3&_nc_sid=59939d&efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjcyMC5mZWVkIn0%3D&_nc_ohc=7fal8isyREkAX_qaFLW&_nc_ht=video.cdninstagram.com&oh=4ce7771da4c9d23894cd6a66083d9a30&oe=60CFE11B&_nc_rid=1bf36e2509"},{"media_type":"IMAGE","id":"17873972485931435","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/120192022_1029836534135582_2784578213731613761_n.jpg?_nc_cat=103&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=L9sAc5G03aoAX9TECQY&_nc_ht=scontent.cdninstagram.com&oh=7c90c004efaac69eee44e2662ba35cf1&oe=60CF78C5"},{"media_type":"IMAGE","id":"18037215217274463","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/120088825_361057395086411_5309419972288671180_n.jpg?_nc_cat=106&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=eWi4mQkGfaEAX8IqWgF&_nc_ht=scontent.cdninstagram.com&oh=5b3c0ff9b8d79d4b294d80d5019cf801&oe=60CFF486"}]
       
  
  
  
System.out.println(data.get(0));

{"media_type":"IMAGE","id":"17917513480681591","media_url":"https:\/\/scontent.cdninstagram.com\/v\/t51.29350-15\/200237138_125086483086409_9210109075071664455_n.jpg?_nc_cat=110&ccb=1-3&_nc_sid=8ae9d6&_nc_ohc=_8lB2IzIMD4AX9T61nx&_nc_ht=scontent.cdninstagram.com&oh=d774452046eb7574af730b58b45ac384&oe=60D0133E"}




JSONArray data = myResponse.getJSONArray("data");
data.getJSONObject(0).get("media_url");
System.out.println(data.getJSONObject(0).get("media_url"));












{
   "error": {
      "message": "Error validating access token: Session has expired on Thursday, 17-Jun-21 00:00:00 PDT. The current time is Thursday, 17-Jun-21 00:04:48 PDT.",
      "type": "OAuthException",
      "code": 190,
      "fbtrace_id": "AgdGLdvIe_OPnuDpml48CTd"
   }
}

--->


Latest

------>
https://api.instagram.com/oauth/authorize
  ?client_id=514475083103764
  &redirect_uri=https://www.srinivart.com/auth/
  &scope=user_profile,user_media
  &response_type=code

https://www.srinivart.com/tdb_templates/author-template-artist-pro/?

code=AQAyxU_Xas1zDZ02v-XeyvN4OZ4-_-V4D3fY9TZBmFMApYh1MNWT6S4S0tKZIGdeLDUquY3lH479U5LC-GmMBCIhr6H8nH9KgJV5UGo_9yPMkhyDTdazPhEoK-WjZWrxK3IpIjbUxPYyizJxVk6dYbMvvztgm6b9g-crdB778fR7L9EBmEJpReUm9qM8oygJIzob5DM64RQ7BzqkVjPENRxIZHWmNPkCBq82mtWUPtYA_w

#_



GET The access Token through Terminal
-------------------------------------

curl -X POST \
  https://api.instagram.com/oauth/access_token \
  -F client_id=514475083103764 \
  -F client_secret=a27ddd4430dd0f374300a2e5cc61edf7 \
  -F grant_type=authorization_code \
  -F redirect_uri=https://www.srinivart.com/auth/ \
  -F code=AQAyxU_Xas1zDZ02v-XeyvN4OZ4-_-V4D3fY9TZBmFMApYh1MNWT6S4S0tKZIGdeLDUquY3lH479U5LC-GmMBCIhr6H8nH9KgJV5UGo_9yPMkhyDTdazPhEoK-WjZWrxK3IpIjbUxPYyizJxVk6dYbMvvztgm6b9g-crdB778fR7L9EBmEJpReUm9qM8oygJIzob5DM64RQ7BzqkVjPENRxIZHWmNPkCBq82mtWUPtYA_w






{"access_token": "IGQVJYNTBPNWYzN3Y2ckZA1Q3JjU3gwMHplWS1pNHkzTWdzOXhid0x4LU1zWTJNbF9ORElJUFRaM0dwUGNaLTBoRHZAYRGNZAS2stUUNld2VBcW95LW1LYy0xNEpJSWpMTnFrOHRLTGRYNVFTVWVzSXViZAXVwaVZAJdlFNYk5F", "user_id": 17841403815449847}
















First 50
--->

https://graph.instagram.com/me/media?fields=id&access_token=IGQVJYNTBPNWYzN3Y2ckZA1Q3JjU3gwMHplWS1pNHkzTWdzOXhid0x4LU1zWTJNbF9ORElJUFRaM0dwUGNaLTBoRHZAYRGNZAS2stUUNld2VBcW95LW1LYy0xNEpJSWpMTnFrOHRLTGRYNVFTVWVzSXViZAXVwaVZAJdlFNYk5F&limit=300


"next": "https://graph.instagram.com/v11.0/17841403815449847/media?access_token=IGQVJYNTBPNWYzN3Y2ckZA1Q3JjU3gwMHplWS1pNHkzTWdzOXhid0x4LU1zWTJNbF9ORElJUFRaM0dwUGNaLTBoRHZAYRGNZAS2stUUNld2VBcW95LW1LYy0xNEpJSWpMTnFrOHRLTGRYNVFTVWVzSXViZAXVwaVZAJdlFNYk5F&pretty=1&fields=id&limit=100&after=QVFIUlY5dDhjZAmN5R2FGeXpRZATd4ci1WRFFNdGthejZASdXgyLXBXeFBKNDhCSlVvV19Rai0tRXFVOWh5TFRWV3VhZADhRRG9NUlVqVnhZAaTVvSmYwemQtQk5B"

  
  
  
  
  
  
 
 
 https://graph.instagram.com/me/media?fields=id,media_type,media_url&access_token=IGQVJYNTBPNWYzN3Y2ckZA1Q3JjU3gwMHplWS1pNHkzTWdzOXhid0x4LU1zWTJNbF9ORElJUFRaM0dwUGNaLTBoRHZAYRGNZAS2stUUNld2VBcW95LW1LYy0xNEpJSWpMTnFrOHRLTGRYNVFTVWVzSXViZAXVwaVZAJdlFNYk5F&limit=300 
  
  
  
  
  





sample Example
----


{
    "data": [
        {
            "id": "17917513480681591"
        },
        {
            "id": "17915548519657304"
        }
           ],
    "paging": {
        "cursors": {
            "before": "QVFIUjZAhVXZAmeEJBWmE0TERIX3RPbEREUzJ1RUhBc21pQUE1VEdpMnI5cU1nUGlDYW03LWJOeU82UE9uck55amo3UFhJQVVhV01uNm9qdDUyX0lWUDNxblVR",
            "after": "QVFIUlY5dDhjZAmN5R2FGeXpRZATd4ci1WRFFNdGthejZASdXgyLXBXeFBKNDhCSlVvV19Rai0tRXFVOWh5TFRWV3VhZADhRRG9NUlVqVnhZAaTVvSmYwemQtQk5B"
        },
    "next": "https://graph.instagram.com/v11.0/17841403815449847/media?access_token=IGQVJYNTBPNWYzN3Y2ckZA1Q3JjU3gwMHplWS1pNHkzTWdzOXhid0x4LU1zWTJNbF9ORElJUFRaM0dwUGNaLTBoRHZAYRGNZAS2stUUNld2VBcW95LW1LYy0xNEpJSWpMTnFrOHRLTGRYNVFTVWVzSXViZAXVwaVZAJdlFNYk5F&pretty=1&fields=id&limit=100&after=QVFIUlY5dDhjZAmN5R2FGeXpRZATd4ci1WRFFNdGthejZASdXgyLXBXeFBKNDhCSlVvV19Rai0tRXFVOWh5TFRWV3VhZADhRRG9NUlVqVnhZAaTVvSmYwemQtQk5B"
    }
}





-->








https://api.instagram.com/oauth/authorize
  ?client_id=514475083103764
  &redirect_uri=https://www.srinivart.com/auth/
  &scope=user_profile,user_media
  &response_type=code



https://www.srinivart.com/auth/?

code=AQA9qz_mi5uQX-TWI_JZrkPoLV1gFjZGBb1aGu66hQkKlkd55J76a_W0VYjb3rVNWARV7CKLPhUknxiZk2vd3_9B7baW22Yyi7h0PKgSBAk6kgje7g0YSxLsegwkMnK9UpQm_GE79LY9WCDiG3cke9bIpihZbVtG_u9n_vK8efFtHYxv6ghoIOiGs7uBR7Oc9puhWNY4yCIWvkiUgidek6E7QD0zUAN-TFOgNz2zlIKckg

#_


GET The access Token through Terminal
-------------------------------------

curl -X POST \
  https://api.instagram.com/oauth/access_token \
  -F client_id=514475083103764 \
  -F client_secret=a27ddd4430dd0f374300a2e5cc61edf7 \
  -F grant_type=authorization_code \
  -F redirect_uri=https://www.srinivart.com/auth/ \
  -F code=AQA9qz_mi5uQX-TWI_JZrkPoLV1gFjZGBb1aGu66hQkKlkd55J76a_W0VYjb3rVNWARV7CKLPhUknxiZk2vd3_9B7baW22Yyi7h0PKgSBAk6kgje7g0YSxLsegwkMnK9UpQm_GE79LY9WCDiG3cke9bIpihZbVtG_u9n_vK8efFtHYxv6ghoIOiGs7uBR7Oc9puhWNY4yCIWvkiUgidek6E7QD0zUAN-TFOgNz2zlIKckg



{"access_token": "IGQVJXWG9YbVhWRzVjT0xxWTM5LXdOR04yQTNzOXhOX3ZA0LTRsSUNaWkdUMjZAXMzlsS05CWEI0d09XZAWRyMDFxX2puVnU5WVRrcTZASSTJrT2EyZAmNmZAS1VNHhoOTVuVWNOSDRJdkg4UnNVU3I1alh4bTQ5ZAG1iMktxN3JR", "user_id": 17841403815449847}







PostMan
---------
Get a Long-Lived Token
---


curl -i -X GET "https://graph.instagram.com/access_token
  ?grant_type=ig_exchange_token
  &client_secret=a27ddd4430dd0f374300a2e5cc61edf7
  &access_token=IGQVJXWG9YbVhWRzVjT0xxWTM5LXdOR04yQTNzOXhOX3ZA0LTRsSUNaWkdUMjZAXMzlsS05CWEI0d09XZAWRyMDFxX2puVnU5WVRrcTZASSTJrT2EyZAmNmZAS1VNHhoOTVuVWNOSDRJdkg4UnNVU3I1alh4bTQ5ZAG1iMktxN3JR"
  
  
  
  
  
  
Response
---------  

{
    "access_token": "IGQVJWaUphaWhSdzFqNE1lN3dFQThZAa3dCdV8wOVRmZAVVoUVREZAlV2eTNOWEdnLUxSU2hkMkNDY2pabnpoeHJrb3RvaUJoR1JQUXdWN3N5eUN6V29heWdqSll6a2l0S0JScFp2NGlB",
    "token_type": "bearer",
    "expires_in": 5184000
}

 
 
 
 
 
 



Refresh Token
-----

curl -i -X GET "https://graph.instagram.com/refresh_access_token?grant_type=ig_refresh_token&access_token=IGQVJWaUphaWhSdzFqNE1lN3dFQThZAa3dCdV8wOVRmZAVVoUVREZAlV2eTNOWEdnLUxSU2hkMkNDY2pabnpoeHJrb3RvaUJoR1JQUXdWN3N5eUN6V29heWdqSll6a2l0S0JScFp2NGlB"
  
    

  
