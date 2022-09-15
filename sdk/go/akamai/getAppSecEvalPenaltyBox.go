// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// **Scopes**: Security policy
//
//  __ASE_Beta__.:
// Returns the penalty box settings for a security policy in evaluation mode - evaluation penalty box.
// When the penalty box is enabled for a policy in evaluation mode, clients that trigger a WAF Deny action are placed in the “penalty box”.
// There, the action you select for the penalty box (either Alert or Deny) continues to apply to any requests from that client for the next 10 minutes.
//
// **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/eval_penalty-box](https://techdocs.akamai.com/application-security/reference/get-policy-eval_penalty-box)
//
// ## Example Usage
//
// Basic usage:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-akamai/sdk/v3/go/akamai"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		configuration, err := akamai.LookupAppSecConfiguration(ctx, &GetAppSecConfigurationArgs{
// 			Name: pulumi.StringRef("Documentation"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		evalPenaltyBox, err := akamai.LookupAppSecEvalPenaltyBox(ctx, &GetAppSecEvalPenaltyBoxArgs{
// 			ConfigId:         configuration.ConfigId,
// 			SecurityPolicyId: "gms1_134637",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("evalPenaltyBoxAction", evalPenaltyBox.Action)
// 		ctx.Export("evalPenaltyBoxEnabled", evalPenaltyBox.Enabled)
// 		ctx.Export("evalPenaltyBoxText", evalPenaltyBox.OutputText)
// 		return nil
// 	})
// }
// ```
// ## Output Options
//
// The following options can be used to determine the information returned, and how that returned information is formatted:
//
// - `action`. Action taken any time the penalty box is triggered. Valid values are:
//   - **alert**. Record the event.
//   - **deny**. The request is blocked.
//   - **deny_custom_{custom_deny_id}**. The action defined by the custom deny is taken.
//   - **none**. Take no action.
// - `enabled`. If **true**, evaluation penalty box protection is enabled. If **false**, evaluation penalty box protection is disabled.
// - `outputText`. Tabular report of evaluation penalty box protection settings.
func LookupAppSecEvalPenaltyBox(ctx *pulumi.Context, args *LookupAppSecEvalPenaltyBoxArgs, opts ...pulumi.InvokeOption) (*LookupAppSecEvalPenaltyBoxResult, error) {
	var rv LookupAppSecEvalPenaltyBoxResult
	err := ctx.Invoke("akamai:index/getAppSecEvalPenaltyBox:getAppSecEvalPenaltyBox", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAppSecEvalPenaltyBox.
type LookupAppSecEvalPenaltyBoxArgs struct {
	// . Unique identifier of the security configuration associated with the evaluation penalty box settings.
	ConfigId int `pulumi:"configId"`
	// . Unique identifier of the security policy associated with the evaluation penalty box settings.
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// A collection of values returned by getAppSecEvalPenaltyBox.
type LookupAppSecEvalPenaltyBoxResult struct {
	Action   string `pulumi:"action"`
	ConfigId int    `pulumi:"configId"`
	Enabled  bool   `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id               string `pulumi:"id"`
	OutputText       string `pulumi:"outputText"`
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

func LookupAppSecEvalPenaltyBoxOutput(ctx *pulumi.Context, args LookupAppSecEvalPenaltyBoxOutputArgs, opts ...pulumi.InvokeOption) LookupAppSecEvalPenaltyBoxResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAppSecEvalPenaltyBoxResult, error) {
			args := v.(LookupAppSecEvalPenaltyBoxArgs)
			r, err := LookupAppSecEvalPenaltyBox(ctx, &args, opts...)
			var s LookupAppSecEvalPenaltyBoxResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAppSecEvalPenaltyBoxResultOutput)
}

// A collection of arguments for invoking getAppSecEvalPenaltyBox.
type LookupAppSecEvalPenaltyBoxOutputArgs struct {
	// . Unique identifier of the security configuration associated with the evaluation penalty box settings.
	ConfigId pulumi.IntInput `pulumi:"configId"`
	// . Unique identifier of the security policy associated with the evaluation penalty box settings.
	SecurityPolicyId pulumi.StringInput `pulumi:"securityPolicyId"`
}

func (LookupAppSecEvalPenaltyBoxOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppSecEvalPenaltyBoxArgs)(nil)).Elem()
}

// A collection of values returned by getAppSecEvalPenaltyBox.
type LookupAppSecEvalPenaltyBoxResultOutput struct{ *pulumi.OutputState }

func (LookupAppSecEvalPenaltyBoxResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAppSecEvalPenaltyBoxResult)(nil)).Elem()
}

func (o LookupAppSecEvalPenaltyBoxResultOutput) ToLookupAppSecEvalPenaltyBoxResultOutput() LookupAppSecEvalPenaltyBoxResultOutput {
	return o
}

func (o LookupAppSecEvalPenaltyBoxResultOutput) ToLookupAppSecEvalPenaltyBoxResultOutputWithContext(ctx context.Context) LookupAppSecEvalPenaltyBoxResultOutput {
	return o
}

func (o LookupAppSecEvalPenaltyBoxResultOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecEvalPenaltyBoxResult) string { return v.Action }).(pulumi.StringOutput)
}

func (o LookupAppSecEvalPenaltyBoxResultOutput) ConfigId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAppSecEvalPenaltyBoxResult) int { return v.ConfigId }).(pulumi.IntOutput)
}

func (o LookupAppSecEvalPenaltyBoxResultOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAppSecEvalPenaltyBoxResult) bool { return v.Enabled }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAppSecEvalPenaltyBoxResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecEvalPenaltyBoxResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAppSecEvalPenaltyBoxResultOutput) OutputText() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecEvalPenaltyBoxResult) string { return v.OutputText }).(pulumi.StringOutput)
}

func (o LookupAppSecEvalPenaltyBoxResultOutput) SecurityPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAppSecEvalPenaltyBoxResult) string { return v.SecurityPolicyId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAppSecEvalPenaltyBoxResultOutput{})
}