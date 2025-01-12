// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v6/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func LookupBotmanCustomDefinedBot(ctx *pulumi.Context, args *LookupBotmanCustomDefinedBotArgs, opts ...pulumi.InvokeOption) (*LookupBotmanCustomDefinedBotResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBotmanCustomDefinedBotResult
	err := ctx.Invoke("akamai:index/getBotmanCustomDefinedBot:getBotmanCustomDefinedBot", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBotmanCustomDefinedBot.
type LookupBotmanCustomDefinedBotArgs struct {
	BotId    *string `pulumi:"botId"`
	ConfigId int     `pulumi:"configId"`
}

// A collection of values returned by getBotmanCustomDefinedBot.
type LookupBotmanCustomDefinedBotResult struct {
	BotId    *string `pulumi:"botId"`
	ConfigId int     `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Json string `pulumi:"json"`
}

func LookupBotmanCustomDefinedBotOutput(ctx *pulumi.Context, args LookupBotmanCustomDefinedBotOutputArgs, opts ...pulumi.InvokeOption) LookupBotmanCustomDefinedBotResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBotmanCustomDefinedBotResult, error) {
			args := v.(LookupBotmanCustomDefinedBotArgs)
			r, err := LookupBotmanCustomDefinedBot(ctx, &args, opts...)
			var s LookupBotmanCustomDefinedBotResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBotmanCustomDefinedBotResultOutput)
}

// A collection of arguments for invoking getBotmanCustomDefinedBot.
type LookupBotmanCustomDefinedBotOutputArgs struct {
	BotId    pulumi.StringPtrInput `pulumi:"botId"`
	ConfigId pulumi.IntInput       `pulumi:"configId"`
}

func (LookupBotmanCustomDefinedBotOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanCustomDefinedBotArgs)(nil)).Elem()
}

// A collection of values returned by getBotmanCustomDefinedBot.
type LookupBotmanCustomDefinedBotResultOutput struct{ *pulumi.OutputState }

func (LookupBotmanCustomDefinedBotResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanCustomDefinedBotResult)(nil)).Elem()
}

func (o LookupBotmanCustomDefinedBotResultOutput) ToLookupBotmanCustomDefinedBotResultOutput() LookupBotmanCustomDefinedBotResultOutput {
	return o
}

func (o LookupBotmanCustomDefinedBotResultOutput) ToLookupBotmanCustomDefinedBotResultOutputWithContext(ctx context.Context) LookupBotmanCustomDefinedBotResultOutput {
	return o
}

func (o LookupBotmanCustomDefinedBotResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupBotmanCustomDefinedBotResult] {
	return pulumix.Output[LookupBotmanCustomDefinedBotResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupBotmanCustomDefinedBotResultOutput) BotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBotmanCustomDefinedBotResult) *string { return v.BotId }).(pulumi.StringPtrOutput)
}

func (o LookupBotmanCustomDefinedBotResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBotmanCustomDefinedBotResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBotmanCustomDefinedBotResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanCustomDefinedBotResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBotmanCustomDefinedBotResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanCustomDefinedBotResult) string { return v.Json }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBotmanCustomDefinedBotResultOutput{})
}
