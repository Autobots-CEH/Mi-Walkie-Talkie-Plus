.class Lcom/sina/weibo/sdk/component/view/TitleBar$1;
.super Ljava/lang/Object;
.source "TitleBar.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sina/weibo/sdk/component/view/TitleBar;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/sina/weibo/sdk/component/view/TitleBar;


# direct methods
.method constructor <init>(Lcom/sina/weibo/sdk/component/view/TitleBar;)V
    .locals 0

    iput-object p1, p0, Lcom/sina/weibo/sdk/component/view/TitleBar$1;->a:Lcom/sina/weibo/sdk/component/view/TitleBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/sina/weibo/sdk/component/view/TitleBar$1;->a:Lcom/sina/weibo/sdk/component/view/TitleBar;

    invoke-static {v0}, Lcom/sina/weibo/sdk/component/view/TitleBar;->a(Lcom/sina/weibo/sdk/component/view/TitleBar;)Lcom/sina/weibo/sdk/component/view/TitleBar$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sina/weibo/sdk/component/view/TitleBar$1;->a:Lcom/sina/weibo/sdk/component/view/TitleBar;

    invoke-static {v0}, Lcom/sina/weibo/sdk/component/view/TitleBar;->a(Lcom/sina/weibo/sdk/component/view/TitleBar;)Lcom/sina/weibo/sdk/component/view/TitleBar$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/sina/weibo/sdk/component/view/TitleBar$a;->a()V

    :cond_0
    return-void
.end method
