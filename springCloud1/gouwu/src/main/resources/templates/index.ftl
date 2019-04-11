<!DOCTYPE HTML>
<head>
    <title>Home</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/slider.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript" src="js/startstop-slider.js"></script>
</head>
<body>
<div class="wrap">
    <div class="header">
        <div class="headertop_desc">
            <div class="call">
                <p><span>需要帮助?</span> call us <span class="number">x-x-xx-x-x-x-x</span></span></p>
            </div>
            <div class="account_desc">
                <ul>
                    <!--
                    <li><a href="#">Register</a></li>
                    <li><a href="#">Login</a></li>
                    <li><a href="#">Delivery</a></li>
                    <li><a href="#">Checkout</a></li>
                    <li><a href="#">My Account</a></li>
                    -->
                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <!--<div class="header_top">
            <div class="logo">
                <a href="index.html"><img src="images/logo.png" alt="" /></a>
            </div>
              <div class="cart">
                     <p>Welcome to our Online Store! <span>Cart:</span><div id="dd" class="wrapper-dropdown-2"> 0 item(s) - $0.00
                         <ul class="dropdown">
                            <li>you have no items in your Shopping cart</li>
                    </ul></div></p>
              </div>
              <script type="text/javascript">
            function DropDown(el) {
                this.dd = el;
                this.initEvents();
            }
            DropDown.prototype = {
                initEvents : function() {
                    var obj = this;

                    obj.dd.on('click', function(event){
                        $(this).toggleClass('active');
                        event.stopPropagation();
                    });
                }
            }

            $(function() {

                var dd = new DropDown( $('#dd') );

                $(document).click(function() {
                    // all dropdowns
                    $('.wrapper-dropdown-2').removeClass('active');
                });

            });

        </script>
     <div class="clear"></div>
  </div>-->
        <div class="header_bottom">
            <div class="menu">
                <ul>
                    <li class="active"><a href="${webPort}:7888">首页</a></li>
                    <li><a href="/gouwu">商城</a></li>
                    <li><a href="${webPort}:7888/my">联系我们</a></li>
                    <div class="clear"></div>
                </ul>
            </div>
            <div class="search_box">
                <form>
                    <input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
                </form>
            </div>
            <div class="clear"></div>
        </div>
        <!--
        <div class="header_slide">
            <div class="header_bottom_left">
                <div class="categories">
                    <ul>
                        <h3>站内推荐</h3>
                        <li><a href="#">Mobile Phones</a></li>
                        <li><a href="#">Desktop</a></li>
                        <li><a href="#">Laptop</a></li>
                        <li><a href="#">Accessories</a></li>
                        <li><a href="#">Software</a></li>
                        <li><a href="#">Sports &amp; Fitness</a></li>
                        <li><a href="#">Footwear</a></li>
                        <li><a href="#">Jewellery</a></li>
                        <li><a href="#">Clothing</a></li>
                        <li><a href="#">Home Decor &amp; Kitchen</a></li>
                        <li><a href="#">Beauty &amp; Healthcare</a></li>
                        <li><a href="#">Toys, Kids &amp; Babies</a></li>
                    </ul>
                </div>
            </div>
            <div class="header_bottom_right">
                <div class="slider">
                    <div id="slider">
                        <div id="mover">
                            <div id="slide-1" class="slide">
                                <div class="slider-img">
                                    <a href="preview.html"><img src="images/slide-1-image.png" alt="learn more" /></a>
                                </div>
                                <div class="slider-text">
                                    <h1>Clearance<br><span>SALE</span></h1>
                                    <h2>UPTo 20% OFF</h2>
                                    <div class="features_list">
                                        <h4>Get to Know More About Our Memorable Services Lorem Ipsum is simply dummy text</h4>
                                    </div>
                                    <a href="preview.html" class="button">Shop Now</a>
                                </div>
                                <div class="clear"></div>
                            </div>
                            <div class="slide">
                                <div class="slider-text">
                                    <h1>Clearance<br><span>SALE</span></h1>
                                    <h2>UPTo 40% OFF</h2>
                                    <div class="features_list">
                                        <h4>Get to Know More About Our Memorable Services</h4>
                                    </div>
                                    <a href="preview.html" class="button">Shop Now</a>
                                </div>
                                <div class="slider-img">
                                    <a href="preview.html"><img src="images/slide-3-image.jpg" alt="learn more" /></a>
                                </div>
                                <div class="clear"></div>
                            </div>
                            <div class="slide">
                                <div class="slider-img">
                                    <a href="preview.html"><img src="images/slide-2-image.jpg" alt="learn more" /></a>
                                </div>
                                <div class="slider-text">
                                    <h1>Clearance<br><span>SALE</span></h1>
                                    <h2>UPTo 10% OFF</h2>
                                    <div class="features_list">
                                        <h4>Get to Know More About Our Memorable Services Lorem Ipsum is simply dummy text</h4>
                                    </div>
                                    <a href="preview.html" class="button">Shop Now</a>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
        -->
    </div>
    <!--<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >网页模板</a></div>-->
    <div class="main">
        <div class="content">
            <div class="content_top">
                <div class="heading">
                    <h3>资源中心</h3>
                </div>
                <div class="see">
                    <p><a href="#">See all Products</a></p>
                </div>
                <div class="clear"></div>
            </div>
            <div class="section group">
                <div class="grid_1_of_4 images_1_of_4">
                    <a href="${webPort}:8774/product?productName=JAVA图书管理系统"><img src="images/jav.jpg" alt="" /></a>
                    <h2>JAVA图书管理系统</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees">$0</span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="${webPort}:8774/product?productName=JAVA图书管理系统">查看详情</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>

                </div>
                <div class="grid_1_of_4 images_1_of_4">
                    <a href="${webPort}:8774/product?productName=JAVA图书管理系统"><img src="images/pygame.jpg" alt="" /></a>
                    <h2>pygame 飞机大战</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees">$0</span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="${webPort}:8774/product?productName=JAVA图书管理系统">查看详情</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>

                </div>
                <div class="grid_1_of_4 images_1_of_4">
                    <a href="${webPort}:8774/product?productName=JAVA图书管理系统"><img src="images/weixin.jpg" alt="" /></a>
                    <h2>SpringBoot 微信点餐系统</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees">$0</span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="${webPort}:8774/product?productName=JAVA图书管理系统">查看详情</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="grid_1_of_4 images_1_of_4">
                    <a href="${webPort}:8774/product?productName=JAVA图书管理系统"><img src="images/shop.jpg" alt="" /></a>
                    <h2>SSM SOA架构电商系统</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees">$0</span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="${webPort}:8774/product?productName=JAVA图书管理系统">查看详情</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
            <div class="content_bottom">
                <div class="heading">
                    <h3>Feature Products</h3>
                </div>
                <div class="see">
                    <p><a href="#">See all Products</a></p>
                </div>
                <div class="clear"></div>
            </div>
            <div class="section group">
                <div class="grid_1_of_4 images_1_of_4">
                    <a href="${webPort}:8774/product?productName=JAVA图书管理系统"><img src="images/jav.jpg" alt="" /></a>
                    <h2>JAVA图书管理系统</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees">$0</span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="${webPort}:8774/product?productName=JAVA图书管理系统">查看详情</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>

                </div>
                <div class="grid_1_of_4 images_1_of_4">
                    <a href="${webPort}:8774/product?productName=JAVA图书管理系统"><img src="images/pygame.jpg" alt="" /></a>
                    <h2>pygame 飞机大战</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees">$0</span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="${webPort}:8774/product?productName=JAVA图书管理系统">查看详情</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>

                </div>
                <div class="grid_1_of_4 images_1_of_4">
                    <a href="${webPort}:8774/product?productName=JAVA图书管理系统"><img src="images/weixin.jpg" alt="" /></a>
                    <h2>SpringBoot 微信点餐系统</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees">$0</span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="${webPort}:8774/product?productName=JAVA图书管理系统">查看详情</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="grid_1_of_4 images_1_of_4">
                    <a href="${webPort}:8774/product?productName=JAVA图书管理系统"><img src="images/shop.jpg" alt="" /></a>
                    <h2>SSM SOA架构电商系统</h2>
                    <div class="price-details">
                        <div class="price-number">
                            <p><span class="rupees">$0</span></p>
                        </div>
                        <div class="add-cart">
                            <h4><a href="${webPort}:8774/product?productName=JAVA图书管理系统">查看详情</a></h4>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--
<div class="footer">
    <div class="wrap">
        <div class="section group">
            <div class="col_1_of_4 span_1_of_4">
                <h4>Information</h4>
                <ul>
                    <li><a href="about.html">About Us</a></li>
                    <li><a href="contact.html">Customer Service</a></li>
                    <li><a href="#">Advanced Search</a></li>
                    <li><a href="delivery.html">Orders and Returns</a></li>
                    <li><a href="contact.html">Contact Us</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>Why buy from us</h4>
                <ul>
                    <li><a href="about.html">About Us</a></li>
                    <li><a href="contact.html">Customer Service</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="contact.html">Site Map</a></li>
                    <li><a href="#">Search Terms</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>My account</h4>
                <ul>
                    <li><a href="contact.html">Sign In</a></li>
                    <li><a href="index.html">View Cart</a></li>
                    <li><a href="#">My Wishlist</a></li>
                    <li><a href="#">Track My Order</a></li>
                    <li><a href="contact.html">Help</a></li>
                </ul>
            </div>
            <div class="col_1_of_4 span_1_of_4">
                <h4>Contact</h4>
                <ul>
                    <li><span>+91-123-456789</span></li>
                    <li><span>+00-123-000000</span></li>
                </ul>
                <div class="social-icons">
                    <h4>Follow Us</h4>
                    <ul>
                        <li><a href="#" target="_blank"><img src="images/facebook.png" alt="" /></a></li>
                        <li><a href="#" target="_blank"><img src="images/twitter.png" alt="" /></a></li>
                        <li><a href="#" target="_blank"><img src="images/skype.png" alt="" /> </a></li>
                        <li><a href="#" target="_blank"> <img src="images/dribbble.png" alt="" /></a></li>
                        <li><a href="#" target="_blank"> <img src="images/linkedin.png" alt="" /></a></li>
                        <div class="clear"></div>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="copy_right">
        <p>Copyright &copy; 2014.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
    </div>
</div>
-->
<script type="text/javascript">
    $(document).ready(function() {
        $().UItoTop({ easingType: 'easeOutQuart' });

    });
</script>
<a href="#" id="toTop"><span id="toTopHover"> </span></a>

</body>
</html>

