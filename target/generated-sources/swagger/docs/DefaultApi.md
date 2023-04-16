# DefaultApi

All URIs are relative to *http://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**shortenPost**](DefaultApi.md#shortenPost) | **POST** /shorten | Shorten the given URL
[**shortenedUrlGet**](DefaultApi.md#shortenedUrlGet) | **GET** /{shortenedUrl} | Redirect to the shortened URL


<a name="shortenPost"></a>
# **shortenPost**
> InlineResponse200 shortenPost(url)

Shorten the given URL

Create an shorten URL based on the given URL

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Url url = new Url(); // Url | URL to be shortened
try {
    InlineResponse200 result = apiInstance.shortenPost(url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#shortenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | [**Url**](Url.md)| URL to be shortened |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="shortenedUrlGet"></a>
# **shortenedUrlGet**
> shortenedUrlGet(shortenedUrl)

Redirect to the shortened URL

Given the shortened URL redirect to the relative URL

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Object shortenedUrl = null; // Object | Shortened URL relative to wanted URL
try {
    apiInstance.shortenedUrlGet(shortenedUrl);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#shortenedUrlGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **shortenedUrl** | [**Object**](.md)| Shortened URL relative to wanted URL |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

