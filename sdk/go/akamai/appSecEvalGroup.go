// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package akamai

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// **Scopes**: Evaluation attack group
//
// Modifies the action and the conditions and exceptions for an evaluation mode attack group.
//
// Note that this resource is only available to organizations running the Adaptive Security Engine (ASE) beta. For more information about ASE, please contact your Akamai representative.
//
// ## Example Usage
//
// Basic usage:
//
// ```go
// package main
//
// import (
// 	"fmt"
// 	"io/ioutil"
//
// 	"github.com/pulumi/pulumi-akamai/sdk/v2/go/akamai"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func readFileOrPanic(path string) pulumi.StringPtrInput {
// 	data, err := ioutil.ReadFile(path)
// 	if err != nil {
// 		panic(err.Error())
// 	}
// 	return pulumi.String(string(data))
// }
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		configuration, err := akamai.LookupAppSecConfiguration(ctx, &GetAppSecConfigurationArgs{
// 			Name: pulumi.StringRef("Documentation"),
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = akamai.NewAppSecEvalGroup(ctx, "evalAttackGroup", &akamai.AppSecEvalGroupArgs{
// 			ConfigId:           pulumi.Int(configuration.ConfigId),
// 			SecurityPolicyId:   pulumi.String("gms1_134637"),
// 			AttackGroup:        pulumi.String("SQL"),
// 			AttackGroupAction:  pulumi.String("deny"),
// 			ConditionException: readFileOrPanic(fmt.Sprintf("%v%v", path.Module, "/condition_exception.json")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type AppSecEvalGroup struct {
	pulumi.CustomResourceState

	// . Unique identifier of the evaluation attack group being modified.
	AttackGroup pulumi.StringOutput `pulumi:"attackGroup"`
	// . Action to be taken any time the attack group is triggered. Allowed values are:
	// - **alert**. Record the event.
	// - **deny**. Block the request
	// - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
	// - **none**. Take no action.
	AttackGroupAction pulumi.StringOutput `pulumi:"attackGroupAction"`
	// . Path to a JSON file containing properties and property values for the attack group. For more information, the [Modify the exceptions of an attack group](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception) section of the Application Security API documentation.
	ConditionException pulumi.StringPtrOutput `pulumi:"conditionException"`
	// . Unique identifier of the security configuration where evaluation is taking place.
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// . Unique identifier of the security policy associated with the evaluation process.
	SecurityPolicyId pulumi.StringOutput `pulumi:"securityPolicyId"`
}

// NewAppSecEvalGroup registers a new resource with the given unique name, arguments, and options.
func NewAppSecEvalGroup(ctx *pulumi.Context,
	name string, args *AppSecEvalGroupArgs, opts ...pulumi.ResourceOption) (*AppSecEvalGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AttackGroup == nil {
		return nil, errors.New("invalid value for required argument 'AttackGroup'")
	}
	if args.AttackGroupAction == nil {
		return nil, errors.New("invalid value for required argument 'AttackGroupAction'")
	}
	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.SecurityPolicyId == nil {
		return nil, errors.New("invalid value for required argument 'SecurityPolicyId'")
	}
	var resource AppSecEvalGroup
	err := ctx.RegisterResource("akamai:index/appSecEvalGroup:AppSecEvalGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAppSecEvalGroup gets an existing AppSecEvalGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAppSecEvalGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppSecEvalGroupState, opts ...pulumi.ResourceOption) (*AppSecEvalGroup, error) {
	var resource AppSecEvalGroup
	err := ctx.ReadResource("akamai:index/appSecEvalGroup:AppSecEvalGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AppSecEvalGroup resources.
type appSecEvalGroupState struct {
	// . Unique identifier of the evaluation attack group being modified.
	AttackGroup *string `pulumi:"attackGroup"`
	// . Action to be taken any time the attack group is triggered. Allowed values are:
	// - **alert**. Record the event.
	// - **deny**. Block the request
	// - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
	// - **none**. Take no action.
	AttackGroupAction *string `pulumi:"attackGroupAction"`
	// . Path to a JSON file containing properties and property values for the attack group. For more information, the [Modify the exceptions of an attack group](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception) section of the Application Security API documentation.
	ConditionException *string `pulumi:"conditionException"`
	// . Unique identifier of the security configuration where evaluation is taking place.
	ConfigId *int `pulumi:"configId"`
	// . Unique identifier of the security policy associated with the evaluation process.
	SecurityPolicyId *string `pulumi:"securityPolicyId"`
}

type AppSecEvalGroupState struct {
	// . Unique identifier of the evaluation attack group being modified.
	AttackGroup pulumi.StringPtrInput
	// . Action to be taken any time the attack group is triggered. Allowed values are:
	// - **alert**. Record the event.
	// - **deny**. Block the request
	// - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
	// - **none**. Take no action.
	AttackGroupAction pulumi.StringPtrInput
	// . Path to a JSON file containing properties and property values for the attack group. For more information, the [Modify the exceptions of an attack group](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception) section of the Application Security API documentation.
	ConditionException pulumi.StringPtrInput
	// . Unique identifier of the security configuration where evaluation is taking place.
	ConfigId pulumi.IntPtrInput
	// . Unique identifier of the security policy associated with the evaluation process.
	SecurityPolicyId pulumi.StringPtrInput
}

func (AppSecEvalGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecEvalGroupState)(nil)).Elem()
}

type appSecEvalGroupArgs struct {
	// . Unique identifier of the evaluation attack group being modified.
	AttackGroup string `pulumi:"attackGroup"`
	// . Action to be taken any time the attack group is triggered. Allowed values are:
	// - **alert**. Record the event.
	// - **deny**. Block the request
	// - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
	// - **none**. Take no action.
	AttackGroupAction string `pulumi:"attackGroupAction"`
	// . Path to a JSON file containing properties and property values for the attack group. For more information, the [Modify the exceptions of an attack group](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception) section of the Application Security API documentation.
	ConditionException *string `pulumi:"conditionException"`
	// . Unique identifier of the security configuration where evaluation is taking place.
	ConfigId int `pulumi:"configId"`
	// . Unique identifier of the security policy associated with the evaluation process.
	SecurityPolicyId string `pulumi:"securityPolicyId"`
}

// The set of arguments for constructing a AppSecEvalGroup resource.
type AppSecEvalGroupArgs struct {
	// . Unique identifier of the evaluation attack group being modified.
	AttackGroup pulumi.StringInput
	// . Action to be taken any time the attack group is triggered. Allowed values are:
	// - **alert**. Record the event.
	// - **deny**. Block the request
	// - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
	// - **none**. Take no action.
	AttackGroupAction pulumi.StringInput
	// . Path to a JSON file containing properties and property values for the attack group. For more information, the [Modify the exceptions of an attack group](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putattackgroupconditionexception) section of the Application Security API documentation.
	ConditionException pulumi.StringPtrInput
	// . Unique identifier of the security configuration where evaluation is taking place.
	ConfigId pulumi.IntInput
	// . Unique identifier of the security policy associated with the evaluation process.
	SecurityPolicyId pulumi.StringInput
}

func (AppSecEvalGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appSecEvalGroupArgs)(nil)).Elem()
}

type AppSecEvalGroupInput interface {
	pulumi.Input

	ToAppSecEvalGroupOutput() AppSecEvalGroupOutput
	ToAppSecEvalGroupOutputWithContext(ctx context.Context) AppSecEvalGroupOutput
}

func (*AppSecEvalGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecEvalGroup)(nil)).Elem()
}

func (i *AppSecEvalGroup) ToAppSecEvalGroupOutput() AppSecEvalGroupOutput {
	return i.ToAppSecEvalGroupOutputWithContext(context.Background())
}

func (i *AppSecEvalGroup) ToAppSecEvalGroupOutputWithContext(ctx context.Context) AppSecEvalGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecEvalGroupOutput)
}

// AppSecEvalGroupArrayInput is an input type that accepts AppSecEvalGroupArray and AppSecEvalGroupArrayOutput values.
// You can construct a concrete instance of `AppSecEvalGroupArrayInput` via:
//
//          AppSecEvalGroupArray{ AppSecEvalGroupArgs{...} }
type AppSecEvalGroupArrayInput interface {
	pulumi.Input

	ToAppSecEvalGroupArrayOutput() AppSecEvalGroupArrayOutput
	ToAppSecEvalGroupArrayOutputWithContext(context.Context) AppSecEvalGroupArrayOutput
}

type AppSecEvalGroupArray []AppSecEvalGroupInput

func (AppSecEvalGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecEvalGroup)(nil)).Elem()
}

func (i AppSecEvalGroupArray) ToAppSecEvalGroupArrayOutput() AppSecEvalGroupArrayOutput {
	return i.ToAppSecEvalGroupArrayOutputWithContext(context.Background())
}

func (i AppSecEvalGroupArray) ToAppSecEvalGroupArrayOutputWithContext(ctx context.Context) AppSecEvalGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecEvalGroupArrayOutput)
}

// AppSecEvalGroupMapInput is an input type that accepts AppSecEvalGroupMap and AppSecEvalGroupMapOutput values.
// You can construct a concrete instance of `AppSecEvalGroupMapInput` via:
//
//          AppSecEvalGroupMap{ "key": AppSecEvalGroupArgs{...} }
type AppSecEvalGroupMapInput interface {
	pulumi.Input

	ToAppSecEvalGroupMapOutput() AppSecEvalGroupMapOutput
	ToAppSecEvalGroupMapOutputWithContext(context.Context) AppSecEvalGroupMapOutput
}

type AppSecEvalGroupMap map[string]AppSecEvalGroupInput

func (AppSecEvalGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecEvalGroup)(nil)).Elem()
}

func (i AppSecEvalGroupMap) ToAppSecEvalGroupMapOutput() AppSecEvalGroupMapOutput {
	return i.ToAppSecEvalGroupMapOutputWithContext(context.Background())
}

func (i AppSecEvalGroupMap) ToAppSecEvalGroupMapOutputWithContext(ctx context.Context) AppSecEvalGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppSecEvalGroupMapOutput)
}

type AppSecEvalGroupOutput struct{ *pulumi.OutputState }

func (AppSecEvalGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AppSecEvalGroup)(nil)).Elem()
}

func (o AppSecEvalGroupOutput) ToAppSecEvalGroupOutput() AppSecEvalGroupOutput {
	return o
}

func (o AppSecEvalGroupOutput) ToAppSecEvalGroupOutputWithContext(ctx context.Context) AppSecEvalGroupOutput {
	return o
}

type AppSecEvalGroupArrayOutput struct{ *pulumi.OutputState }

func (AppSecEvalGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AppSecEvalGroup)(nil)).Elem()
}

func (o AppSecEvalGroupArrayOutput) ToAppSecEvalGroupArrayOutput() AppSecEvalGroupArrayOutput {
	return o
}

func (o AppSecEvalGroupArrayOutput) ToAppSecEvalGroupArrayOutputWithContext(ctx context.Context) AppSecEvalGroupArrayOutput {
	return o
}

func (o AppSecEvalGroupArrayOutput) Index(i pulumi.IntInput) AppSecEvalGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AppSecEvalGroup {
		return vs[0].([]*AppSecEvalGroup)[vs[1].(int)]
	}).(AppSecEvalGroupOutput)
}

type AppSecEvalGroupMapOutput struct{ *pulumi.OutputState }

func (AppSecEvalGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AppSecEvalGroup)(nil)).Elem()
}

func (o AppSecEvalGroupMapOutput) ToAppSecEvalGroupMapOutput() AppSecEvalGroupMapOutput {
	return o
}

func (o AppSecEvalGroupMapOutput) ToAppSecEvalGroupMapOutputWithContext(ctx context.Context) AppSecEvalGroupMapOutput {
	return o
}

func (o AppSecEvalGroupMapOutput) MapIndex(k pulumi.StringInput) AppSecEvalGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AppSecEvalGroup {
		return vs[0].(map[string]*AppSecEvalGroup)[vs[1].(string)]
	}).(AppSecEvalGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecEvalGroupInput)(nil)).Elem(), &AppSecEvalGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecEvalGroupArrayInput)(nil)).Elem(), AppSecEvalGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppSecEvalGroupMapInput)(nil)).Elem(), AppSecEvalGroupMap{})
	pulumi.RegisterOutputType(AppSecEvalGroupOutput{})
	pulumi.RegisterOutputType(AppSecEvalGroupArrayOutput{})
	pulumi.RegisterOutputType(AppSecEvalGroupMapOutput{})
}