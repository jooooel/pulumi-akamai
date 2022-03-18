// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecContractsGroups
    {
        /// <summary>
        /// **Scopes**: Contract; group
        /// 
        /// Returns information about the contracts and groups associated with your account. Among other things, this information is required to create a new security configuration and to return a list of the hostnames available for use in a security policy. The returned information for this data source is described in the [List contracts and groups](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getcontractsandgroupswithksdorwaf) of the Application Security API.
        /// 
        /// **Related API Endpoint**: [/appsec/v1/contracts-groups](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getcontractsandgroupswithksdorwaf)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic usage:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Akamai = Pulumi.Akamai;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var contractsGroups = Output.Create(Akamai.GetAppSecContractsGroups.InvokeAsync(new Akamai.GetAppSecContractsGroupsArgs
        ///         {
        ///             Contractid = "5-2WA382",
        ///             Groupid = 12198,
        ///         }));
        ///         this.ContractsGroupsList = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.OutputText);
        ///         this.ContractsGroupsJson = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.Json);
        ///         this.ContractGroupsDefaultContractid = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.DefaultContractid);
        ///         this.ContractGroupsDefaultGroupid = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.DefaultGroupid);
        ///     }
        /// 
        ///     [Output("contractsGroupsList")]
        ///     public Output&lt;string&gt; ContractsGroupsList { get; set; }
        ///     [Output("contractsGroupsJson")]
        ///     public Output&lt;string&gt; ContractsGroupsJson { get; set; }
        ///     [Output("contractGroupsDefaultContractid")]
        ///     public Output&lt;string&gt; ContractGroupsDefaultContractid { get; set; }
        ///     [Output("contractGroupsDefaultGroupid")]
        ///     public Output&lt;string&gt; ContractGroupsDefaultGroupid { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Output Options
        /// 
        /// The following options can be used to determine the information returned, and how that returned information is formatted:
        /// 
        /// - `json`. JSON-formatted list of contract and group information.
        /// - `output_text`. Tabular report of contract and group information.
        /// - `default_contractid`. Default contract ID for the specified contract and group.
        /// - `default_groupid`. Default group ID for the specified contract and group.
        /// </summary>
        public static Task<GetAppSecContractsGroupsResult> InvokeAsync(GetAppSecContractsGroupsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAppSecContractsGroupsResult>("akamai:index/getAppSecContractsGroups:getAppSecContractsGroups", args ?? new GetAppSecContractsGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// **Scopes**: Contract; group
        /// 
        /// Returns information about the contracts and groups associated with your account. Among other things, this information is required to create a new security configuration and to return a list of the hostnames available for use in a security policy. The returned information for this data source is described in the [List contracts and groups](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getcontractsandgroupswithksdorwaf) of the Application Security API.
        /// 
        /// **Related API Endpoint**: [/appsec/v1/contracts-groups](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getcontractsandgroupswithksdorwaf)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic usage:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Akamai = Pulumi.Akamai;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var contractsGroups = Output.Create(Akamai.GetAppSecContractsGroups.InvokeAsync(new Akamai.GetAppSecContractsGroupsArgs
        ///         {
        ///             Contractid = "5-2WA382",
        ///             Groupid = 12198,
        ///         }));
        ///         this.ContractsGroupsList = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.OutputText);
        ///         this.ContractsGroupsJson = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.Json);
        ///         this.ContractGroupsDefaultContractid = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.DefaultContractid);
        ///         this.ContractGroupsDefaultGroupid = contractsGroups.Apply(contractsGroups =&gt; contractsGroups.DefaultGroupid);
        ///     }
        /// 
        ///     [Output("contractsGroupsList")]
        ///     public Output&lt;string&gt; ContractsGroupsList { get; set; }
        ///     [Output("contractsGroupsJson")]
        ///     public Output&lt;string&gt; ContractsGroupsJson { get; set; }
        ///     [Output("contractGroupsDefaultContractid")]
        ///     public Output&lt;string&gt; ContractGroupsDefaultContractid { get; set; }
        ///     [Output("contractGroupsDefaultGroupid")]
        ///     public Output&lt;string&gt; ContractGroupsDefaultGroupid { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Output Options
        /// 
        /// The following options can be used to determine the information returned, and how that returned information is formatted:
        /// 
        /// - `json`. JSON-formatted list of contract and group information.
        /// - `output_text`. Tabular report of contract and group information.
        /// - `default_contractid`. Default contract ID for the specified contract and group.
        /// - `default_groupid`. Default group ID for the specified contract and group.
        /// </summary>
        public static Output<GetAppSecContractsGroupsResult> Invoke(GetAppSecContractsGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAppSecContractsGroupsResult>("akamai:index/getAppSecContractsGroups:getAppSecContractsGroups", args ?? new GetAppSecContractsGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppSecContractsGroupsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// . Unique identifier of an Akamai contract. If not included, information is returned for all the Akamai contracts associated with your account.
        /// </summary>
        [Input("contractid")]
        public string? Contractid { get; set; }

        /// <summary>
        /// . Unique identifier of a contract group. If not included, information is returned for all the groups associated with your account.
        /// </summary>
        [Input("groupid")]
        public int? Groupid { get; set; }

        public GetAppSecContractsGroupsArgs()
        {
        }
    }

    public sealed class GetAppSecContractsGroupsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// . Unique identifier of an Akamai contract. If not included, information is returned for all the Akamai contracts associated with your account.
        /// </summary>
        [Input("contractid")]
        public Input<string>? Contractid { get; set; }

        /// <summary>
        /// . Unique identifier of a contract group. If not included, information is returned for all the groups associated with your account.
        /// </summary>
        [Input("groupid")]
        public Input<int>? Groupid { get; set; }

        public GetAppSecContractsGroupsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAppSecContractsGroupsResult
    {
        public readonly string? Contractid;
        public readonly string DefaultContractid;
        public readonly int DefaultGroupid;
        public readonly int? Groupid;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly string OutputText;

        [OutputConstructor]
        private GetAppSecContractsGroupsResult(
            string? contractid,

            string defaultContractid,

            int defaultGroupid,

            int? groupid,

            string id,

            string json,

            string outputText)
        {
            Contractid = contractid;
            DefaultContractid = defaultContractid;
            DefaultGroupid = defaultGroupid;
            Groupid = groupid;
            Id = id;
            Json = json;
            OutputText = outputText;
        }
    }
}