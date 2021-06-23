'use strict';
const MANIFEST = 'flutter-app-manifest';
const TEMP = 'flutter-temp-cache';
const CACHE_NAME = 'flutter-app-cache';
const RESOURCES = {
  "assets/AssetManifest.json": "ab2091b91951c090958e7171308a3f0c",
"assets/assets/fonts/Itim-Regular.ttf": "ea9ed37af3e95dd1629a9581ceb2c4ed",
"assets/assets/fonts/Montserrat-Medium.ttf": "c8b6e083af3f94009801989c3739425e",
"assets/assets/fonts/Pacifico-Regular.ttf": "9b94499ccea3bd82b24cb210733c4b5e",
"assets/assets/images/avatar_profile.png": "76b7cc338e6fcd248583ef0a93d6719d",
"assets/assets/images/baby-beef.png": "0840f2d8511bbb7cdae9cba9c92dc7db",
"assets/assets/images/bell2.png": "f7724ce530e6cd09df8695fa83889276",
"assets/assets/images/cover_page.jpg": "ed0251383a6cd14b44473176da8bd5a0",
"assets/assets/images/cutlery.png": "14a8013ab033223c839d34438292f9b7",
"assets/assets/images/diet.png": "e52894a42739b9aa743a10f8dd7801c7",
"assets/assets/images/FamiliarGrande.png": "9643425d329a1e2a593d0d3668e11c2a",
"assets/assets/images/farmacia.png": "677172d6cebfed4101a3906446050be2",
"assets/assets/images/fast-food.png": "c91fbe03c6133bb7294c7f948e81624b",
"assets/assets/images/ferreteria.png": "863d4380a04db7498c58b54dfcda51ba",
"assets/assets/images/hamburguesa_ejemplo.jpg": "a66b44ebc0e4c4849cad43579acf8ec9",
"assets/assets/images/hotdog.jpg": "ce3a8bf17b517b15a9ebe946fe3b8e1b",
"assets/assets/images/loader.gif": "44808102085ce802d283b9dddae53074",
"assets/assets/images/login_background.png": "91b0ab8639bb7c57ad9655c4ea2f55bc",
"assets/assets/images/logoapp.png": "3b60a88a3b79391cbd630e0b037e1ffc",
"assets/assets/images/mascotas.png": "959558aa77f98576b47949e7c6681ab3",
"assets/assets/images/medicine.png": "383a85d24b3e67c230a8dad4ba53f61a",
"assets/assets/images/papeleria.png": "9a013a93a02607dbcb34a874e371f840",
"assets/assets/images/profile_picture.png": "b214b8dcda002fbec06851badbfefed2",
"assets/assets/images/profile_picture2.png": "9eba71abe34d4022bb97b696f8bb9aeb",
"assets/assets/images/restaurant.png": "6fa4d24331ce925bb1234cd3b5677c3c",
"assets/assets/images/settings.png": "59fcb6d90a7e20297b171a2347984e0b",
"assets/assets/images/shopping-cart.png": "fef92a65de967b9cb19bc3509cff26f6",
"assets/assets/images/stonks.jpg": "de09716dc10e05683e929c0626a61e9d",
"assets/assets/images/user.png": "7d56d975418a52a571ae93e9f64254cd",
"assets/FontManifest.json": "36a91115fb532d70a55f941e96aaa843",
"assets/fonts/MaterialIcons-Regular.otf": "4e6447691c9509f7acdbf8a931a85ca1",
"assets/NOTICES": "fc755b930f5fc3c4aa8b88de483c8fc7",
"assets/packages/cupertino_icons/assets/CupertinoIcons.ttf": "6d342eb68f170c97609e9da345464e5e",
"assets/packages/flutter_signin_button/assets/logos/2.0x/facebook_new.png": "83bf0093719b2db2b16e2839aee1069f",
"assets/packages/flutter_signin_button/assets/logos/2.0x/google_dark.png": "937022ea241c167c8ce463d2ef7ed105",
"assets/packages/flutter_signin_button/assets/logos/2.0x/google_light.png": "8f10eb93525f0c0259c5e97271796b3c",
"assets/packages/flutter_signin_button/assets/logos/3.0x/facebook_new.png": "12531aa3541312b7e5ddd41223fc60cb",
"assets/packages/flutter_signin_button/assets/logos/3.0x/google_dark.png": "ac553491f0002941159b405c2d37e8c6",
"assets/packages/flutter_signin_button/assets/logos/3.0x/google_light.png": "fe46d37e7d6a16ecd15d5908a795b4ee",
"assets/packages/flutter_signin_button/assets/logos/facebook_new.png": "e1dff5c319a9d7898aee817f624336e3",
"assets/packages/flutter_signin_button/assets/logos/google_dark.png": "c32e2778b1d6552b7b4055e49407036f",
"assets/packages/flutter_signin_button/assets/logos/google_light.png": "f71e2d0b0a2bc7d1d8ab757194a02cac",
"assets/packages/font_awesome_flutter/lib/fonts/fa-brands-400.ttf": "00bb2b684be61e89d1bc7d75dee30b58",
"assets/packages/font_awesome_flutter/lib/fonts/fa-regular-400.ttf": "4b6a9b7c20913279a3ad3dd9c96e155b",
"assets/packages/font_awesome_flutter/lib/fonts/fa-solid-900.ttf": "dffd9504fcb1894620fa41c700172994",
"favicon.png": "520d34bcf694ac66a14c7252af16c2dd",
"icons/Icon-192.png": "3d412df74eb1a529a35d9af1cc43f88a",
"icons/Icon-512.png": "fd350e879b23f10e03c1206af189c0b9",
"index.html": "e270079409869a5c002730edfb6b8552",
"/": "e270079409869a5c002730edfb6b8552",
"main.dart.js": "f2bcf86fcee7d81a41a4b79b32e466c2",
"manifest.json": "11f0001a5434417004e393ef72920ecc",
"version.json": "6fe16395189bb09502d44fc18e122c77"
};

// The application shell files that are downloaded before a service worker can
// start.
const CORE = [
  "/",
"main.dart.js",
"index.html",
"assets/NOTICES",
"assets/AssetManifest.json",
"assets/FontManifest.json"];
// During install, the TEMP cache is populated with the application shell files.
self.addEventListener("install", (event) => {
  self.skipWaiting();
  return event.waitUntil(
    caches.open(TEMP).then((cache) => {
      return cache.addAll(
        CORE.map((value) => new Request(value, {'cache': 'reload'})));
    })
  );
});

// During activate, the cache is populated with the temp files downloaded in
// install. If this service worker is upgrading from one with a saved
// MANIFEST, then use this to retain unchanged resource files.
self.addEventListener("activate", function(event) {
  return event.waitUntil(async function() {
    try {
      var contentCache = await caches.open(CACHE_NAME);
      var tempCache = await caches.open(TEMP);
      var manifestCache = await caches.open(MANIFEST);
      var manifest = await manifestCache.match('manifest');
      // When there is no prior manifest, clear the entire cache.
      if (!manifest) {
        await caches.delete(CACHE_NAME);
        contentCache = await caches.open(CACHE_NAME);
        for (var request of await tempCache.keys()) {
          var response = await tempCache.match(request);
          await contentCache.put(request, response);
        }
        await caches.delete(TEMP);
        // Save the manifest to make future upgrades efficient.
        await manifestCache.put('manifest', new Response(JSON.stringify(RESOURCES)));
        return;
      }
      var oldManifest = await manifest.json();
      var origin = self.location.origin;
      for (var request of await contentCache.keys()) {
        var key = request.url.substring(origin.length + 1);
        if (key == "") {
          key = "/";
        }
        // If a resource from the old manifest is not in the new cache, or if
        // the MD5 sum has changed, delete it. Otherwise the resource is left
        // in the cache and can be reused by the new service worker.
        if (!RESOURCES[key] || RESOURCES[key] != oldManifest[key]) {
          await contentCache.delete(request);
        }
      }
      // Populate the cache with the app shell TEMP files, potentially overwriting
      // cache files preserved above.
      for (var request of await tempCache.keys()) {
        var response = await tempCache.match(request);
        await contentCache.put(request, response);
      }
      await caches.delete(TEMP);
      // Save the manifest to make future upgrades efficient.
      await manifestCache.put('manifest', new Response(JSON.stringify(RESOURCES)));
      return;
    } catch (err) {
      // On an unhandled exception the state of the cache cannot be guaranteed.
      console.error('Failed to upgrade service worker: ' + err);
      await caches.delete(CACHE_NAME);
      await caches.delete(TEMP);
      await caches.delete(MANIFEST);
    }
  }());
});

// The fetch handler redirects requests for RESOURCE files to the service
// worker cache.
self.addEventListener("fetch", (event) => {
  if (event.request.method !== 'GET') {
    return;
  }
  var origin = self.location.origin;
  var key = event.request.url.substring(origin.length + 1);
  // Redirect URLs to the index.html
  if (key.indexOf('?v=') != -1) {
    key = key.split('?v=')[0];
  }
  if (event.request.url == origin || event.request.url.startsWith(origin + '/#') || key == '') {
    key = '/';
  }
  // If the URL is not the RESOURCE list then return to signal that the
  // browser should take over.
  if (!RESOURCES[key]) {
    return;
  }
  // If the URL is the index.html, perform an online-first request.
  if (key == '/') {
    return onlineFirst(event);
  }
  event.respondWith(caches.open(CACHE_NAME)
    .then((cache) =>  {
      return cache.match(event.request).then((response) => {
        // Either respond with the cached resource, or perform a fetch and
        // lazily populate the cache.
        return response || fetch(event.request).then((response) => {
          cache.put(event.request, response.clone());
          return response;
        });
      })
    })
  );
});

self.addEventListener('message', (event) => {
  // SkipWaiting can be used to immediately activate a waiting service worker.
  // This will also require a page refresh triggered by the main worker.
  if (event.data === 'skipWaiting') {
    self.skipWaiting();
    return;
  }
  if (event.data === 'downloadOffline') {
    downloadOffline();
    return;
  }
});

// Download offline will check the RESOURCES for all files not in the cache
// and populate them.
async function downloadOffline() {
  var resources = [];
  var contentCache = await caches.open(CACHE_NAME);
  var currentContent = {};
  for (var request of await contentCache.keys()) {
    var key = request.url.substring(origin.length + 1);
    if (key == "") {
      key = "/";
    }
    currentContent[key] = true;
  }
  for (var resourceKey of Object.keys(RESOURCES)) {
    if (!currentContent[resourceKey]) {
      resources.push(resourceKey);
    }
  }
  return contentCache.addAll(resources);
}

// Attempt to download the resource online before falling back to
// the offline cache.
function onlineFirst(event) {
  return event.respondWith(
    fetch(event.request).then((response) => {
      return caches.open(CACHE_NAME).then((cache) => {
        cache.put(event.request, response.clone());
        return response;
      });
    }).catch((error) => {
      return caches.open(CACHE_NAME).then((cache) => {
        return cache.match(event.request).then((response) => {
          if (response != null) {
            return response;
          }
          throw error;
        });
      });
    })
  );
}
