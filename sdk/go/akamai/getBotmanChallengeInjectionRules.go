// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-akamai/sdk/v6/go/akamai/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupBotmanChallengeInjectionRules(ctx *pulumi.Context, args *LookupBotmanChallengeInjectionRulesArgs, opts ...pulumi.InvokeOption) (*LookupBotmanChallengeInjectionRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBotmanChallengeInjectionRulesResult
	err := ctx.Invoke("akamai:index/getBotmanChallengeInjectionRules:getBotmanChallengeInjectionRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBotmanChallengeInjectionRules.
type LookupBotmanChallengeInjectionRulesArgs struct {
	ConfigId int `pulumi:"configId"`
}

// A collection of values returned by getBotmanChallengeInjectionRules.
type LookupBotmanChallengeInjectionRulesResult struct {
	ConfigId int `pulumi:"configId"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Json string `pulumi:"json"`
}

func LookupBotmanChallengeInjectionRulesOutput(ctx *pulumi.Context, args LookupBotmanChallengeInjectionRulesOutputArgs, opts ...pulumi.InvokeOption) LookupBotmanChallengeInjectionRulesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBotmanChallengeInjectionRulesResult, error) {
			args := v.(LookupBotmanChallengeInjectionRulesArgs)
			r, err := LookupBotmanChallengeInjectionRules(ctx, &args, opts...)
			var s LookupBotmanChallengeInjectionRulesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBotmanChallengeInjectionRulesResultOutput)
}

// A collection of arguments for invoking getBotmanChallengeInjectionRules.
type LookupBotmanChallengeInjectionRulesOutputArgs struct {
	ConfigId pulumi.IntInput `pulumi:"configId"`
}

func (LookupBotmanChallengeInjectionRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanChallengeInjectionRulesArgs)(nil)).Elem()
}

// A collection of values returned by getBotmanChallengeInjectionRules.
type LookupBotmanChallengeInjectionRulesResultOutput struct{ *pulumi.OutputState }

func (LookupBotmanChallengeInjectionRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBotmanChallengeInjectionRulesResult)(nil)).Elem()
}

func (o LookupBotmanChallengeInjectionRulesResultOutput) ToLookupBotmanChallengeInjectionRulesResultOutput() LookupBotmanChallengeInjectionRulesResultOutput {
	return o
}

func (o LookupBotmanChallengeInjectionRulesResultOutput) ToLookupBotmanChallengeInjectionRulesResultOutputWithContext(ctx context.Context) LookupBotmanChallengeInjectionRulesResultOutput {
	return o
}

func (o LookupBotmanChallengeInjectionRulesResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBotmanChallengeInjectionRulesResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBotmanChallengeInjectionRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanChallengeInjectionRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBotmanChallengeInjectionRulesResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBotmanChallengeInjectionRulesResult) string { return v.Json }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBotmanChallengeInjectionRulesResultOutput{})
}