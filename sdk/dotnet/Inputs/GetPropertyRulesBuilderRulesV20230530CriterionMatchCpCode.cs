// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCodeArgs : global::Pulumi.InvokeArgs
    {
        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        [Input("value")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCodeValueArgs? Value { get; set; }

        public GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCodeArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCodeArgs Empty => new GetPropertyRulesBuilderRulesV20230530CriterionMatchCpCodeArgs();
    }
}
