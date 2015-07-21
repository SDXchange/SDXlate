---
myTestText: # XMILE Models, Translation, Transport, and Exchange
---
<!DOCTYPE html>
<html>

  <head>
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="description" content="Sdxlate : Xmile Translators and Related Development Tools ">

    <link rel="stylesheet" type="text/css" media="screen" href="stylesheets/stylesheet.css">

    <title>Sdxlate</title>
  </head>

  <body>


    <!-- HEADER -->
    {% include header.html %}

    <!-- MAIN CONTENT -->
    <div id="main_content_wrap" class="outer">
      <section id="main_content" class="inner">

{{ myTestText | markdownify }}

<p>SDXchange is an open source project devoted to enabling exchange of XMILE-coded System Dynamics simulation models. To that end, we foster

<p>the creation and publication of open source, stand-alone translators, both from other formats to Xmile and from Xmile to other formats;

<UL>
<LI>the exchange of Xmile models, through an open catalog of models available from our own model archive and other model archives;</LI>

<LI>the creation and publication of tools that directly manipulate Xmile (for example model refactoring tools); and</LI>

<LI>the creation and publication of embeddable Xmile components that make it easier for developers and experimenters to use Xmile models in their own projects.</LI>

</UL>
<p>For developer-oriented documentation and support, please see our [wiki](wiki).
      </section>
    </div>

    <!-- FOOTER  -->
    {% include footer.html %}
</body>
</html>